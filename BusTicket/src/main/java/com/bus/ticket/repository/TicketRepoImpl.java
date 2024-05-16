package com.bus.ticket.repository;

import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.bus.ticket.dto.Bus;
import com.bus.ticket.dto.Route;
import com.bus.ticket.dto.Ticket;
import com.bus.ticket.util.DBConnector;

public class TicketRepoImpl implements TicketRepository {

	private static TicketRepoImpl instance;
	private DBConnector conn;
	private Properties prop;

	private TicketRepoImpl() {
		conn = DBConnector.getInstance();
		prop = new Properties();
		try (FileInputStream io = new FileInputStream("config.properties")) {
			prop.load(io);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static TicketRepository getInstance() {
		return instance = instance != null ? instance : new TicketRepoImpl();
	}

	@Override
	public List<Ticket> findTicket(String from, String to, LocalDate date) {
		List<Ticket> list = new ArrayList<>();
		try (PreparedStatement pre = conn.getConnection().prepareStatement(prop.getProperty("ticket.select"))) {
			pre.setString(1, from);
			pre.setString(2, to);
			ResultSet rs = pre.executeQuery();
			while(rs.next()) {
				list.add(getTicket(rs));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	private Ticket getTicket(ResultSet rs) throws SQLException {
		Bus bus = new Bus();
		Route route = new Route();
		bus.setId(rs.getInt(1));
		bus.setBusLineName(rs.getString(2));
		bus.setBusType(rs.getString(3));
		route.setId(rs.getInt(4));
		route.setFrom(rs.getString(5));
		route.setTo(rs.getString(6));
		Ticket ticket = new Ticket(rs.getInt(7), bus, route, rs.getInt(8), rs.getTime(9).toLocalTime());
		return ticket;
	}

	@Override
	public Ticket findTicketById(int id) {
		return null;
	}

	@Override
	public List<Ticket> findAllTicket() {
		return null;
	}

}

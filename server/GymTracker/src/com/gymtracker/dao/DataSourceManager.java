package com.gymtracker.dao;

import java.util.Locale;
import java.util.TimeZone;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DataSourceManager extends AbstractRoutingDataSource {

	private DataSource dataSource;

	@PostConstruct
	public void initialize() {
		Locale.setDefault(new Locale("pt", "BR"));
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
		try {
			Class.forName("org.postgresql.Driver");
			String hostname = System.getProperty("RDS_HOSTNAME");
			String port = System.getProperty("RDS_PORT");
			String user = System.getProperty("RDS_USERNAME");
			String password = System.getProperty("RDS_PASSWORD");
			if (hostname == null || hostname.trim().isEmpty())
				hostname = "localhost";
			if (port == null || port.trim().isEmpty())
				port = "5432";
			if (user == null || user.trim().isEmpty())
				user = "postgres";
			if (password == null || password.trim().isEmpty())
				password = "postgres";
			String urlBase = "jdbc:postgresql://" + hostname + ":" + port + "/gymtracker";
			dataSource = new DriverManagerDataSource(urlBase.toLowerCase(), user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected DataSource determineTargetDataSource() {
		return dataSource;
	}

}

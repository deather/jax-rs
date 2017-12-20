package com.skeleton.db;

import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.SQLException;

import org.postgresql.ds.PGPoolingDataSource;
import org.postgresql.util.Base64;

public class EncryptedDataSource extends PGPoolingDataSource {

	public EncryptedDataSource() {
		this.setUser("");
		this.setPassword("");
		this.setUrl("jdbc:mysql://localhost:3306/chess");
	}

	@Override
	public Connection getConnection(String user, String password) throws SQLException {
		return super.getConnection(this.getUser(), this.getPassword());
	}
}

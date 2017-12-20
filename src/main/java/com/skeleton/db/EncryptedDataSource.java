package com.skeleton.db;

import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.cj.jdbc.MysqlDataSource;


public class EncryptedDataSource extends MysqlDataSource {

	public EncryptedDataSource() {
		this.setUser("");
		this.setPassword("");
		this.setUrl("jdbc:mysql://localhost:3306/chess");
	}
}

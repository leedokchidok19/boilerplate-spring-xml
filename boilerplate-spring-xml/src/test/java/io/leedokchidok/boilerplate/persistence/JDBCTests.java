package io.leedokchidok.boilerplate.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//static

	@Test
	public void testConnection() {
		try (Connection con =
				DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:XE",
						"ex_username",
						"ex_password")){
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}//testConnection

}//JDBCTests

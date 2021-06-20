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
			Class.forName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//static

	@Test
	public void testConnection() {
		try (Connection con =
				DriverManager.getConnection(//mysql 연결
						"jdbc:log4jdbc:mysql://127.0.0.1:3306/DB_Schema?serverTimezone=UTC&useSSL=false",
						"ex_username",
						"ex_password")){
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}//testConnection

}//JDBCTests

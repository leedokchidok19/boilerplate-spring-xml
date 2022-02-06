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

		//DB schema
		String schema = "DB_Schema";
		String username = "ex_username";
		String password = "ex_password";

		try (Connection con =
				DriverManager.getConnection(//mysql 연결 : DB_Schema/ex_username/ex_password
						"jdbc:log4jdbc:mysql://127.0.0.1:3306/"+schema+"?serverTimezone=UTC&useSSL=false",
						username,
						password)){
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}//testConnection

}//JDBCTests

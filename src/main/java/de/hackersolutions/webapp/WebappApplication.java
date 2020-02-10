package de.hackersolutions.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class WebappApplication {

	public static void main(String[] args) {

		Statement stmt = null;
		Connection conn = null;

		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:h2Database", "", "");
			stmt = conn.createStatement();
			stmt.execute("CREATE TABLE IF NOT EXISTS car (" +
					"id int NOT NULL PRIMARY KEY AUTO_INCREMENT," +
					"modelName varchar(255)," +
					"color varchar(255)," +
					"wheels int," +
					"PRIMARY KEY (id)" +
			");");
			stmt.close();
			conn.close();


		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}


		SpringApplication.run(WebappApplication.class, args);
	}

}

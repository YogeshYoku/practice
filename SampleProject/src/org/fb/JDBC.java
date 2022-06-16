package org.fb;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		java.sql.Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "Yogesh911@");
		String querry="select * from employees";
		PreparedStatement prepareStatement = connection.prepareStatement(querry);
		ResultSet executeQuery = prepareStatement.executeQuery();
		while (executeQuery.next()) {
			int int1 = executeQuery.getInt("employee_id");
			System.out.println(int1);
			String string = executeQuery.getString("first_name");
			System.out.println(string);

		}
		connection.close();	
	}

}

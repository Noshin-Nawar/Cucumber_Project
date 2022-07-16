package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	
	Connection connection;
	Statement statement;
	ResultSet resultset;
	String columnValue;
	
	
	public String getDataFromDb(String ColumnName) {
		
		try {
			//set the properties of mySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			String sqlURL = "jdbc:mysql://localhost:3306/december2021";
			String sqlUsername = "root";
			String sqlPassword = "root";
			String sqlQuery = "select * from users";
			
			//create a connection to the local database
			connection = DriverManager.getConnection(sqlURL, sqlUsername, sqlPassword);
			
			//Empower the connection reference variable to execute queries
		    statement = connection.createStatement();
			
			//Deliver the query
			resultset = statement.executeQuery(sqlQuery);
			
			
			
			while(resultset.next()) {
			return columnValue =	resultset.getString(ColumnName);
				
				
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if (resultset !=null) {
				try {
					resultset.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}if (connection !=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		
		return columnValue;
		
		
		
	}	
	
	
}

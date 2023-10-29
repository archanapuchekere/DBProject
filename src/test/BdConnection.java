package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BdConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		Statement stat = con.createStatement();
		ResultSet result = stat.executeQuery("select * from eproduct");
		while(result.next()) {
			System.out.println("Product Id :" + result.getInt("id"));
			System.out.println("Product Name : "+ result.getString("name"));
			
		}
		
		con.close();
	}

}

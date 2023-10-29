package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExmple {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("update eproduct set price=50000.00 where name='Laptop'");
		stmt.executeQuery("select * from eproduct");
		ResultSet res = stmt.executeQuery("select * from eproduct");
		while(res.next()) {
			System.out.print("Product ID : " + res.getInt("id"));
			System.out.print(" Product Name : "+ res.getString("name"));
			System.out.print(" Price : "+ res.getDouble("price"));
			System.out.println();
		}
con.close();
	}

}

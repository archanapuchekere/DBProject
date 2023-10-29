package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DeleteExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("delete from eproduct where name='tv'");
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

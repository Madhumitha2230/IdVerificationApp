package com.id.DAO;

import com.id.regLogin.RegLogin;
import com.id.user.UserCard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegLoginDAOImpl implements RegLoginDAO{

	public void reglog(RegLogin reg) throws Exception {
		
		Connection connection=null;
		PreparedStatement statement=null;
		
		try {
			//Step 1 : Database Driver ( Optional)
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2: Get the Connection
			Connection connection1 = DriverManager.getConnection(
					"jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			System.out.println(connection1);
			
			//3.query
			String sql=" INSERT INTO regLogin (NAME,email,phoneNo,PASSWORD) VALUES(?,?,?,?)\r\n";
			
			statement=connection.prepareStatement(sql);
			statement.setString(1,reg.getName());
			statement.setString(2,reg.getEmail());
			statement.setString(3,reg.getPhoneNo());
			statement.setString(4,reg.getPassword());
			
			int rows=statement.executeUpdate();
			System.out.println(rows);
		}
			
			
		catch(Exception e) {
			e.printStackTrace();
		}
		
		statement.close();
		connection.close();
		
		
	}
	
	
	
}

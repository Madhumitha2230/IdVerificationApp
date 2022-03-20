package com.id.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.id.user.UserCard;


public class UserDAOImpl implements UserCardDAO{

	public void addCard(UserCard user) throws Exception {
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
			String sql="INSERT INTO usercard (NAME,email,cardName,cardNum,dateOfIssued,renewalDate) VALUES (?,?,?,?,?,?)"; 
			
			statement=connection.prepareStatement(sql);
			statement.setString(1, user.getName());
			statement.setString(2, user.getEmail());
			statement.setString(3, user.getCardName());
			statement.setString(4, user.getCardNum());
			statement.setDate(5, user.getDateOfIssued());
			statement.setDate(6, user.getRenewalDate());
			
			int rows =statement.executeUpdate();
			System.out.println(rows);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		statement.close();
		connection.close();
		
		
	}
	
}
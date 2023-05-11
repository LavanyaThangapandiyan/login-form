package com.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.register.model.User;
import com.register.util.ConnectionUtil;

public class RegisterImpl implements RegisterDao{

	@Override
	public int insertUserDetails(User user) {
		// TODO Auto-generated method stub
		int status=0;
		Connection con = null;
		try {
			con = ConnectionUtil.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String insert="insert into register(name,password,email,mobile_number)values(?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(insert);
			ps.setString(1, user.getUserName());
			ps.setString(2,user.getPassword());
			ps.setString(3,user.getEmail());
			ps.setString(4,user.getMobileNumber());
		    status = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public User getUserDetails(String userName,String password){
		// TODO Auto-generated method stub
		User user=new User();
		Connection con = null;
		try {
			con = ConnectionUtil.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String get="select * from register where name=? and password=?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(get);
			ps.setString(1,userName);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				user.setUserName(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setEmail(rs.getString(3));
				user.setMobileNumber(rs.getString(4));	
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return user;
	}

}

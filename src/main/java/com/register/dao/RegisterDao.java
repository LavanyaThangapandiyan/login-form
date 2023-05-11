package com.register.dao;

import java.sql.SQLException;

import com.register.model.User;

public interface RegisterDao {
	public int insertUserDetails(User user) throws ClassNotFoundException, SQLException;
	public User getUserDetails(String userName,String password) throws ClassNotFoundException, SQLException;

}

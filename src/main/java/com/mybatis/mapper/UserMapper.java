package com.mybatis.mapper;

import java.util.List;

import com.mybatis.model.User;

public interface UserMapper
{
	public void insertUser( User user );

	public User getUserById( Integer userId );

	public List<User> getAllUsers();

	public void updateUser( User user );

	public void deleteUser( Integer userId );
}


package com.steven.dao;

import java.util.List;

import com.steven.bean.User;

public interface UserDao {
	public List<User> findUserByName(String username);
}

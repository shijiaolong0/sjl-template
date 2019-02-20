package com.sjl.system.dao;

import java.util.List;

import com.sjl.system.entity.User; 


public interface UserDao {
	List<User> findAll();
}

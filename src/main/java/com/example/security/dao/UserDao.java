package com.example.security.dao;

import com.example.security.entity.User;

/**
 * @author lmh
 * @date 2018/11/20 17:39
 * @desc
 */
public interface UserDao {
	public User findByUserName(String username);

}

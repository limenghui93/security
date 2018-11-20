package com.example.security.entity;

/**
 * @author lmh
 * @date 2018/11/20 16:27
 * @desc
 */
public class UserRole {
	private int id;

	private int userId;

	private int roleId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}

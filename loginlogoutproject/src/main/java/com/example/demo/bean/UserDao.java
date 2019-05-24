package com.example.demo.bean;

public interface UserDao {
	int register(UserMaster userRegister);

	UserMaster validateUser(UserMaster userMaster);
}
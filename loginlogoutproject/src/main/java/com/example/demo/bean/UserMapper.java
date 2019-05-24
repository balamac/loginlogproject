package com.example.demo.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

class UserMapper implements RowMapper<UserMaster> {
	public UserMaster mapRow(ResultSet rs, int arg1) throws SQLException {
		UserMaster userLoginBean = new UserMaster();
		userLoginBean.setUserId(rs.getString("userid"));
		userLoginBean.setPassWord(rs.getString("password"));

		return userLoginBean;
	}
}
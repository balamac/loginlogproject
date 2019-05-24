package com.example.demo.bean;

import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbcTemplate;

	public int register(UserMaster userMaster) {
		String sql = "insert into usermaster values(?,?)";
		int count = jdbcTemplate.update(sql, new Object[] { userMaster.getUserId(), userMaster.getPassWord() });
		return count;
	}

	public UserMaster validateUser(UserMaster userMaster) {
		String sql = "select * from usermaster where userid='" + userMaster.getUserId() + "' and password='"
				+ userMaster.getPassWord() + "'";
		List<UserMaster> usersloginBean = jdbcTemplate.query(sql, new UserMapper());
		return usersloginBean.size() > 0 ? usersloginBean.get(0) : null;
	}
}

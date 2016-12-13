package com.steven.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.steven.bean.User;
import com.steven.dao.UserDao;


public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {
	@Override
	public List<User> findUserByName(String username) {
		return (List<User>) getSqlMapClientTemplate().queryForList("findUserByName",username);
	}
}

package com.qya.demo.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.qya.demo.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Resource //使用spring3的注解注入  
	private SqlSession sqlSession;  
	
	@Override
	public User get(String userId) {
		sqlSession.selectOne("");
		return null;
	}

}

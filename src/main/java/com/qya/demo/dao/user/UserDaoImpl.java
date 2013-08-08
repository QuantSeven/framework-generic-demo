package com.qya.demo.dao.user;

import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Repository;

import com.qya.demo.model.user.User;

import framework.generic.dao.GenericDaoImpl;

@Repository("userDao")
public class UserDaoImpl extends GenericDaoImpl<User, String> implements UserDao {

	@Override
	public User get(String userId, String userName) {
		String[] array = new String[]{userId,userName};
		Map<Object, Object> paramMap = ArrayUtils.toMap(array);
		return null;
		
	}

}

package com.qya.demo.dao.user;

import com.qya.demo.model.user.User;

import framework.generic.dao.GenericDao;

public  interface UserDao extends GenericDao<User, String> {

	User get(String userId,String userName);
}
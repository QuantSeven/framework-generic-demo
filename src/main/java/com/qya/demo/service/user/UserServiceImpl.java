package com.qya.demo.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qya.demo.dao.user.UserDao;
import com.qya.demo.model.user.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Override
	public User save(User user) {
		return  userDao.insert(user);
	}
	@Override
	public User modify(User user) {
		User u = userDao.get(user.getUserId());
		return userDao.update(u);
	}

}

package com.qya.demo.service.user;

import com.qya.demo.model.user.User;

public interface UserService {
	User save(User user);

	User modify(User user);
}

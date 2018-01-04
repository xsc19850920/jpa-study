package com.genpact.jpaproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genpact.jpaproject.dao.UserDao;
import com.genpact.jpaproject.entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public User createUser(User user) {
		return userDao.save(user);
	}

	public void deleteUser(Long userId) {
		userDao.delete(userId);
	}

	public User findOne(Long id) {
		return userDao.findOne(id);
	}

	public User findByUsername(String userName) {
		return userDao.findUserByUsername(userName);
	}

}

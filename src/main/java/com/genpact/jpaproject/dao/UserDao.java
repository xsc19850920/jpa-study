package com.genpact.jpaproject.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.genpact.jpaproject.entity.User;

public interface UserDao extends CrudRepository<User, Serializable> ,JpaSpecificationExecutor<User>{
	User findUserByUsername(String username);
}

package com.afbdev.dao;

import java.util.List;

import com.afbdev.model.User;

/**
 * Interface for UserDAO
 */
public interface UserDAO {

	public void create(User user);

	public void delete(User user);
	
	public void update(User user);

	public User findById(Integer id);

	public List<User> findByProperty(String propertyName, Object value);

	public List<User> findAll();

}
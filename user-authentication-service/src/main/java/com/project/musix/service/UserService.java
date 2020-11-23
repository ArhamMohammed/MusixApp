package com.project.musix.service;

import com.project.musix.model.User;

public interface UserService {
	
	public boolean deleteUser(String u);
	public boolean addUser(User u);
	public boolean validate(String username,String password);
	public boolean updateUser(String username, String oldpass, String newpass);
}
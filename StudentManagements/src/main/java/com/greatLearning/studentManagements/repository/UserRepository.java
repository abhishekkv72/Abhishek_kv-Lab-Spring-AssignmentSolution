package com.greatLearning.studentManagements.repository;

import com.greatLearning.studentManagements.entity.User;

public interface UserRepository {

	public User getUserByUsername(String username);
	
}

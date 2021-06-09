package com.vl.info.repository;



	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vl.info.entities.User;

   @Repository
	public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsernameAndPassword(String username, String password);
		
		
		  public User findByUserNameAndPassword(User user); 
//		 // public User validateLogin(User user);
//		//  public User updateUser(User user);
//		  public List<User> find();
//		 
	}


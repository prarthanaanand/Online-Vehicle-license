package com.vl.info.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vl.info.entities.*;
import com.vl.info.repository.*;


@Transactional
@Service
 

public class UserServices implements IUserServices {

	@Autowired
	UserRepository userRepository;

	@Override
	public User Register(User user) {

		return userRepository.save(user);
	}

	

	@Override
	public User LogIn(String username, String password) {
		// TODO Auto-generated method stub
		return userRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public User LogOut(User user) {
		// TODO Auto-generated method stub
		//return userRepository.findbyusernameandpassword(user);
	return null;
	}


	

}

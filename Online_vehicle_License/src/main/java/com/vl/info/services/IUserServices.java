package com.vl.info.services;



	import com.vl.info.entities.User;

	public interface IUserServices {
		
		public User Register(User user);
		public User LogIn(String username, String password);
		//public String validateLogin(User user);
		public User LogOut(User user);

	}


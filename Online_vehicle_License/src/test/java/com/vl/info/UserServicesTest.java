package com.vl.info;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.vl.info.entities.Role;
import com.vl.info.entities.User;
import com.vl.info.repository.UserRepository;
import com.vl.info.services.UserServices;

@SpringBootTest
public class UserServicesTest {

	
	@Mock
	private UserRepository userRepository;
	@InjectMocks
	private UserServices userServiceImp;
	
	@Test
	public void RegisterTest()
	{
		//Arranging the data
		final User user1 = new User(1L, "Sudharshan", "1234");
	
		final User user2 = new User(1L, "Sudharshan", "1234");

	
		when(userRepository.save(user2)).thenReturn(user1);
		//Act
		System.out.println("user2" +user2);
		System.out.println("user1" +user1);
		User newuser=userServiceImp.Register(user2);
		System.out.println("newuser" +newuser);
		//Assert
		Assertions.assertEquals(user1,newuser);
		//Assertions.assertEquals(user1,userServiceImp.register(user2));
		
}
	
	@Test
	public void  LogInTest()
	{
		User user=new User("abc","1234");
	
		when(userRepository.findByUsernameAndPassword("abc", "1234")).thenReturn(user);
		Assertions.assertEquals(user, userServiceImp.LogIn("abc", "1234"));
	}

//	@Test
//	public void logOuttest()
//	{
//		User user=new User("abc","1234");
//		
//		when(userRepository.findbyusernameandpassword(user)).thenReturn(user);
//		Assertions.assertEquals(user, userServiceImp.LogOut(user));
//
//		
//	}






}
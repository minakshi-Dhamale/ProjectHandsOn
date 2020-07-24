package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.modal.UserEducationDetails;
import com.modal.UserPersonalDetails;
import com.service.UserService;

import lombok.experimental.PackagePrivate;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addUser(@RequestBody UserPersonalDetails u) {
		System.out.println("Add user ---controller");
		service.addUserPersonalDetails(u);
		System.out.println("user Added" +u.getUserId());
		return "User added successfully!!!";
	}
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public List<UserPersonalDetails> getAllUserDeatils(UserPersonalDetails u){
		System.out.println("get all user details---controller");
		List<UserPersonalDetails> list=service.getUserPersonalDetails(u);
		for(UserPersonalDetails details:list) {
			System.out.println("UserDetails"+details);
		}
		

		return list;
	}
	
	@RequestMapping(value="/getByGender/{userGender}",method=RequestMethod.GET)
	public List<UserPersonalDetails> getUserDetailByGender(@PathVariable String userGender) {
		System.out.println("get user by gender");
		List<UserPersonalDetails> list= service.getData(userGender);
		return list;
	}
	
	@RequestMapping(value="/getByAge/{age}", method=RequestMethod.GET)
	public List<UserPersonalDetails> getUserDteailByAge(@PathVariable int age) {
		System.out.println("get user detail by age");
		List<UserPersonalDetails> list=service.getDataByAge(age);
		return list;
	}
	
	@RequestMapping(value="/getByAgeGreater/{age}",method=RequestMethod.GET)
	public List<UserPersonalDetails> getUserDetailsByAgeGreaterThan(@PathVariable int age,UserPersonalDetails user){
		System.out.println("get user detail by whose age is greater");
		System.out.println("age"+user.getAge());
		List<UserPersonalDetails> list=service.getDataByAgeGretaerThan(age);
		return list;
	
	}
	
	
	@RequestMapping(value="/del/{userId}",method=RequestMethod.DELETE)
	public String deletUser(@PathVariable int userId) {
		System.out.println("delete user");
		service.deleteUser(userId);
		return "user deleted successfully!!!";
		
	}
	
	@RequestMapping(value="/edit/{userId}",method=RequestMethod.GET)
	public UserPersonalDetails editDetails(@PathVariable int userId) {
		System.out.println("edit user");
		UserPersonalDetails u1=service.editDetails(userId);
		return u1;
		
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateUserDetails(@RequestBody UserPersonalDetails u) {
		System.out.println("update user");
		service.update(u);
		return "user details updated successfully!!!";
		
	}
	
	
}
	

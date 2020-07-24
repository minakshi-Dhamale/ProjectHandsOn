package com.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.UserPersonalDetails;
import com.repository.UserRepository;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository r;
	
	@Override
	public void addUserPersonalDetails(UserPersonalDetails u) {
		System.out.println("---add user---service");
		r.save(u);
		
	}

	@Override
	public List<UserPersonalDetails> getUserPersonalDetails(UserPersonalDetails u) {
		System.out.println("---getUser---service");
		List<UserPersonalDetails> list=(List<UserPersonalDetails>) r.findAll();
		return list;
	}

	@Override
	public void deleteUser(int userId) {
		System.out.println("---delete user---service");
		r.deleteById(userId);
		
	}

	/*
	 * @Override public UserPersonalDetails editDetails(int userId) {
	 * System.out.println("edit detais---service"); UserPersonalDetails
	 * u1=r.findOne() u1;
	 * 
	 * }
	 */

	@Override
	public UserPersonalDetails update(UserPersonalDetails u) {
		System.out.println("---update user---service");
		return r.save(u);
		
	}

	@Override
	public UserPersonalDetails editDetails(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserPersonalDetails> getData(String userGender) {
		System.out.println("---get data by Gender---service");
		List<UserPersonalDetails> list=r.findAllByUserGender(userGender);
		return  list;
	}

	@Override
	public List<UserPersonalDetails> getDataByAge(int age) {
		System.out.println("---get data by age---service");
		List<UserPersonalDetails> list=r.findAllByAge(age);
		

		return list;
	}

	@Override
	public List<UserPersonalDetails> getDataByAgeGretaerThan(int age) {
		System.out.println("---get user details by whose age is gretaer than----");

		List<UserPersonalDetails> list=r.findByAgeGreaterThan(age);
		return list;
	}
	
	

}

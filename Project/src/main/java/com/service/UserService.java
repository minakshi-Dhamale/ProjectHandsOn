package com.service;

import java.util.List;
import java.util.Optional;

import com.modal.UserPersonalDetails;

public interface UserService {
	
	public void addUserPersonalDetails(UserPersonalDetails u);
	public List<UserPersonalDetails> getUserPersonalDetails(UserPersonalDetails u);
	public void deleteUser(int userId);
	public UserPersonalDetails editDetails(int userId);
	public UserPersonalDetails update(UserPersonalDetails u);
	public List<UserPersonalDetails>  getData(String userGender);
	public List<UserPersonalDetails> getDataByAge(int age);
	
	public List<UserPersonalDetails> getDataByAgeGretaerThan(int age);
}

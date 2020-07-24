package com.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.modal.UserPersonalDetails;

public interface UserRepository extends CrudRepository<UserPersonalDetails, Integer>{
	
	public List<UserPersonalDetails> findAllByUserGender(String userGender);
	
	public List<UserPersonalDetails> findAllByAge(int age);
	
	public List<UserPersonalDetails> findByAgeGreaterThan(int age);
	
}

package com.modal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Setter
@Getter
@NonNull
public class UserPersonalDetails {
	@Id
	private int userId;
	private String userName;
	private String userLastName;
	private String userGender;
	private String userContact;
	private String userAddress;
	private String userLangaugeKnown;
	private int age;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="educationId")
	private UserEducationDetails userEducationDetails;
	
	/*
	 * @OneToOne(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="email") private Login login;
	 */
	
	
	
	
}

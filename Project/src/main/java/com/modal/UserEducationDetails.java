package com.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Getter
@Setter
@NonNull
public class UserEducationDetails {
	@Id
	private int educationId;
	private String userCourseName;
	
}

package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		if (password.length() < 5) {
			throw new TooShortException("Password should have more than 5 characters");
		}
		if (password.length() > 15) {
			throw new TooLongException("Password should not exceed 15 characters");
		}
		
		return true;
	}

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] userNames = new String[] {"Chaitu","Pavan","SriPriya"};
		for (String userName : userNames) {
			if(userName.equals(username)) {
				throw new NameExistsException("User Name already exists");
			}
		}
		return true;
	}

}

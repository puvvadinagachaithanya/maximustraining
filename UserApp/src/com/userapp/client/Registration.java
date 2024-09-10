package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

public class Registration {

	public static void main(String[] args) {

		IValidationService validationService = new ValidationServiceImpl();

		try {
			//exception for user name exist
			//boolean isNewUser = validationService.validateUsername("Chaitu");
			
			boolean isNewUser = validationService.validateUsername("Puvvadi");
			if (isNewUser) {
				//exception for too short password
				//boolean isPasswordTooShort = validationService.validatePassword("1234");
				
				//exception for too long password
				//boolean isPasswordTooLong = validationService.validatePassword("12345656745566455");
				
				boolean isPasswordCorrect = validationService.validatePassword("12345678");
				if (isPasswordCorrect) {
					System.out.println("Welcome chaitu your registration got successful ");
				}
			}

		} catch (NameExistsException ex) {
			System.out.println(ex.getMessage());
		} catch (TooShortException ex) {
			System.out.println(ex.getMessage());
		} catch (TooLongException ex) {
			System.out.println(ex.getMessage());
		}

		finally {
			System.out.println("close db");
		}

	}

}

package com.voterapp.client;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;
import com.voterapp.service.ElectionBoothServiceImpl;
import com.voterapp.service.IElectionBoothService;

public class Voter {

	public static void main(String[] args) {
		IElectionBoothService electionService = new ElectionBoothServiceImpl();
		try {
			boolean isEligible = electionService.checkEligibility(19, "JPNagar", 1500);
			if (isEligible) {
				System.out.println("Eligible for voting");
			}
		} catch (UnderAgeException ex) {
			System.out.println(ex.getMessage());
		} catch (LocalityNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (InvalidVoterIDException ex) {
			System.out.println(ex.getMessage());
		} catch (NotEligibleException ex) {
			System.out.println(ex.getMessage());
		}
	}

}

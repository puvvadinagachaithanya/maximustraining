package com.voterapp.service;

import com.voterapp.exception.InvalidVoterIDException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NotEligibleException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothServiceImpl implements IElectionBoothService {

	@Override
	public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {

		if (checkAge(age)) {
			if (checkLocality(locality)) {
				if (checkVoterId(vid)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean checkAge(int age) throws UnderAgeException {
		if (age < 18)
			throw new UnderAgeException("Age should be above 18");
		return true;
	}

	private boolean checkLocality(String locality) throws LocalityNotFoundException {
		String[] localities = new String[] { "JPNagar", "BTM", "Banshankari" };

		for (String area : localities) {
			if (area.equals(locality)) {
				return true;
			}
		}
		throw new LocalityNotFoundException("Locality not found");

	}

	private boolean checkVoterId(int voterId) throws InvalidVoterIDException {
		if (voterId > 1000 && voterId < 9999) {
			return true;
		}
		throw new InvalidVoterIDException("Voter Id is invalid");

	}

}

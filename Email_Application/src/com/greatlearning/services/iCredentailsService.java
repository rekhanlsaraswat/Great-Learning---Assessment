package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.interfaces.iCredentials;
import com.greatlearning.model.Employee;

public class iCredentailsService implements iCredentials {
	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) 
	{
		String atSymbol ="@";
		String emailAddress=firstName+lastName+atSymbol+department+"gl.com";
		return emailAddress;
	}
	public String generatePassword() 
	{
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*()?>:}|]{[" ;
		String allValues = capitalLetters + smallLetters + numbers + specialCharacters ;
		Random randomObj = new Random();
		String Password ="";
		for (int i=0; i<8; i++)
		{
			int boundValue = allValues.length();
			int randomIndex = randomObj.nextInt(boundValue);
			char randomChar = allValues.charAt(randomIndex);
			Password += String.valueOf(randomChar);
		}
		return Password;
	}
	public void showCredentials(Employee employee) 
	{
			System.out.println("Dear "+ employee.getFirstName() + " your generated credentials are:");
			System.out.println("Email ID  : " + employee.getEmail());
			System.out.println("Password  : " + employee.getPassword());
	}

}

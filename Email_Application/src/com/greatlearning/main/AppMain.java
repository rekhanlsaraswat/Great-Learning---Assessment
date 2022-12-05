package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.interfaces.iCredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.services.iCredentailsService;

public class AppMain 
{
	public static void main(String[] args) 
	{
		Employee demoEmployee = new Employee("John","Adam");
		iCredentials credentialsService = new iCredentailsService();
		
		System.out.println("Please choose the department from the following options:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		int option = userInput.nextInt();
		
		String generatedEmail = null;
		String generatedPassword = null;
		
		switch(option)
		{
			case 1:
			{//dept is technical, short form is tech
				generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName(),demoEmployee.getLastName(), "tech");
				generatedPassword=credentialsService.generatePassword();
				break;
			}
			case 2:
			{//dept is Admin, short form is ad
				generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName(),demoEmployee.getLastName(), "ad");
				generatedPassword=credentialsService.generatePassword();
				break;
			}
			case 3:
			{//dept is Human Resources, short form is hr
				generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName(),demoEmployee.getLastName(), "hr");
				generatedPassword=credentialsService.generatePassword();
				break;
			}
			case 4:
			{//dept is Legal, short form is lg
				generatedEmail=credentialsService.generateEmailAddress(demoEmployee.getFirstName(),demoEmployee.getLastName(), "lg");
				generatedPassword=credentialsService.generatePassword();
				break;
			}
			default:
				System.out.println("Enter a valid department option");
		}
		demoEmployee.setEmail(generatedEmail);
		demoEmployee.setPassword(generatedPassword);
		credentialsService.showCredentials(demoEmployee);
	}
}

import java.util.Scanner;

public class AddingStrings {
	
	/*
	  Program: AddingStrings.java
	  Programmer: Melissa Hardwick
	  Purpose: Accept user input and add two strings together
	 */

	public static void main(String[] args) {
		
		String first, last, fullName, major;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println();
		System.out.println("I will add two strings into one statement");
		System.out.println();
		
		System.out.println("Enter your first name");
		first = keyboard.nextLine();
		
		System.out.println();
		System.out.println("Enter your last name and hit enter");
		last = keyboard.nextLine();
		
		System.out.println();
		System.out.println("What is your major?");
		major = keyboard.nextLine();
		
		fullName = first + " " + last;
		
		System.out.println();
		System.out.println("Full Name: " + fullName);
		System.out.println();
		
		System.out.println("Major is: " + major + "\n");

	}

}

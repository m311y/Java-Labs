/*
Programmer: Melissa Hardwick
Class: CIT149 Spring 2021
Assignment: Chapter 6 Lab 2
Purpose: The purpose of this program is to ask ask a student if they are part time or full time and then display their tuition.
*/

//Import Scanner and NumberFormat
import java.text.NumberFormat;
import java.util.Scanner;

public class Ch6Lab2A {

	public static void main(String[] args) {
		//Declarations
		String status;
		int hours;
		double rate, tuition = 0;
		
		//Construct Scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Set currency number format
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		//Create a do/while loop that runs once, and repeats only if p or f is not entered
		do {
			System.out.println("Enter P for part time or F for full time student");
			status = keyboard.next();
			if(status.equalsIgnoreCase("P")) {
				System.out.println("Enter the number of hours you will be taking");
				hours = keyboard.nextInt();
				rate = 50.00;
				tuition = rate * hours;
			}
			else 
				tuition = 540.00;
			
		} while(!status.equalsIgnoreCase("P") && !status.equalsIgnoreCase("F")); 
				System.out.println("Your tuition for this semester is " + currency.format(tuition));
				
				//Close scanner
				keyboard.close();
			
		

	}

}

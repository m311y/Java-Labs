/*
Programmer: Melissa Hardwick
Class: CIT149 Spring 2021
Assignment: Chapter 6 Lab 1
Purpose: Test the while loop, and if/else statements. The user will have the choice of ending the program.
*/

//Import Scanner
import java.util.Scanner;
public class Ch6Lab1 {

	public static void main(String[] args) {
		//Declare variables
		double salary;
		String answer;
		boolean quitProgram = false;
		
		//Construct scanner
		Scanner keyboard = new Scanner(System.in);
		
		while(quitProgram == false) {
			
			System.out.println();
			System.out.println("Enter your current monthly salary");
			salary = keyboard.nextDouble();
			
			if(salary >= 4700) {
				System.out.println("A salary of $" + salary + " isn't chicken feed");
			}
			else if(salary >= 2100.00 && salary < 4700.00) {
				System.out.println("A salary of $" + salary + " isn't too bad. Could be better.");
			}
			else {
				System.out.println("You need a raise!");
				System.out.println("Tell your boss that you work really hard and deserve a raise!");
			}
			
			System.out.println("End program? Enter Y or N");
			answer = keyboard.next();
			if(answer.equalsIgnoreCase("Y")) {
				keyboard.close();
				quitProgram = true;
			}
		}

	}

}

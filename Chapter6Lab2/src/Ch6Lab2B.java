/*
Programmer: Melissa Hardwick
Class: CIT149 Spring 2021
Assignment: Chapter 6 Lab 2
Purpose: The purpose of this program is to ask ask a student if they are part time or full time, their salary, and hours taken and then display their tuition.
*/

//Import Scanner and NumberFormat
import java.text.NumberFormat;
import java.util.Scanner;

public class Ch6Lab2B {
	public static int getChoice() {
		//Declarations
		int choice;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("\nWhat is your current status?\n\n1) Part time\n2) Full time");
		choice = keyboard.nextInt();
		if(choice != 1 || choice != 2) {
			choice = 0;
		}
		return choice;
	}
	
	public static double getTuition(int choice) {
		int hours;
		double rate, tuition = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		switch(choice) {

		default:
			System.out.println("\nError has occured. You must choose either 1 or 2");
			break;
			
		case 1:
			System.out.println("\nHow many hours are you taking?");
			hours = keyboard.nextInt();
			rate = 50.00;
			tuition = rate * hours;
			System.out.println("\nYour tuition for this semester is " + currency.format(tuition));
			break;
			
		case 2:
			System.out.println("\nHow many hours are you taking?");
			hours = keyboard.nextInt();
			rate = 540.00;
			tuition = rate * hours;
			System.out.println("\nYour tuition for this semester is " + currency.format(tuition));
			break;
		}
		
		return tuition;
	}

	public static void main(String[] args) {
		//Declarations
		String answer;
		int choice, hours, scholarship = 0;
		double rate, tuition;
		boolean quitProgram = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			choice = getChoice();
			tuition = getTuition(choice);
			
			while(scholarship == 0 || scholarship > 2) {
				System.out.println("\nIs your salary less than $20,000 a year? Enter:\n\n1) Yes\n2) No\n");
				scholarship = keyboard.nextInt();
				
				switch(scholarship) {
					
					case 1:
						System.out.println("\n\nCongratulations! You qualify for financial aid.\nPlease visit our Financial Aid. Visit our financial aid office soon.");
						break;
					case 2:
						System.out.println("\n\nSorry you do not qualify for financial aid this year.\nApply again next year, the earlier the better.");
						break;
					
					default:
						System.out.println("\nYour answer must either be Yes or No. Please try again");
						break;
					
				}
			}
			
			keyboard.nextLine();
			
			System.out.println("\nDo you want to quit the program? Please enter true or false\n");
			answer = keyboard.nextLine();
			quitProgram = Boolean.parseBoolean(answer);
			
			if(quitProgram == false)
				scholarship = 0;
			} while(quitProgram == false);
		
		//Close scanner
		keyboard.close();
		
		}
	}


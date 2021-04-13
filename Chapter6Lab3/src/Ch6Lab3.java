/*
Programmer: Melissa Hardwick
Class: CIT149 Spring 2021
Assignment: Chapter 6 Lab 3
Purpose: The purpose of this program is to accept number of grades input and then accepts that number of grades and outputs the total number of grade points and the grade point average.
*/

import java.util.Scanner;
import java.text.DecimalFormat;
public class Ch6Lab3 {

	public static void main(String[] args) {
		//Declarations
		int numberOfGrades;
		double grade, totalGrades = 0, average;
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("How many grades will you enter?");
		numberOfGrades = input.nextInt();
		
		for(int i = 1; i <= numberOfGrades; i++) {
			System.out.println("\nenter grade " + i);
			grade = input.nextDouble();
			
			totalGrades = totalGrades + grade;
		}
		
		average = totalGrades / numberOfGrades;
		System.out.println("\nThe total grades are " + df.format(totalGrades) + " and the average grade is " + df.format(average));

	}

}

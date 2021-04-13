/*
 * Date: February 26, 2021
 * Programmer: Melissa Hardwick
 * Purpose: To check to see if a string contains specific words
*/

import java.util.Scanner;
public class Ch5Lab1 {

	public static void main(String[] args) {
		String line;
		int index1, index2, index3;
		
		Scanner keyboard = new Scanner(System.in);
		
		// Request input form the user
		System.out.println("Please enter a line to be checked to see if it contains either the word 'course', 'school'. or 'java'");
		
		line = keyboard.nextLine().toLowerCase(); //change input to lowercase
		index1 = line.indexOf("course");
		index2 = line.indexOf("school");
		index3 = line.indexOf("java");
		
		System.out.println("You entered >  " + line);
		
		if(index1>-1)
			System.out.println("Your line contains the word 'course'");
		else
			System.out.println("Your line does not contain the word 'course'");
		
		if(index2 > -1)
			System.out.println("Your line contains the word 'school'");
		else
			System.out.println("Your line does not contain the word 'school'");
		
		if(index3 > -1)
			System.out.println("Your line contains the word 'java'");
		else
			System.out.println("Your line does not contain the word 'java'");


	}

}

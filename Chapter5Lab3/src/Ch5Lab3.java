/*
 * Date: February 26, 2021
 * Programmer: Melissa Hardwick
 * Purpose: To convert temperatures between C and F
*/
import java.util.Scanner;

public class Ch5Lab3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double degrees, converted;
		String scale;
		
		System.out.println();//Blank
		System.out.println();
		System.out.println("Enter a temperature in degress (for example 29.6): ");
		degrees = keyboard.nextDouble();
		
		System.out.println();
		System.out.println("Enter 'f' for Fahrenheit or 'c' for Celsius: ");
		scale = keyboard.next();
		System.out.println();
		switch(scale)
		{
			case "F": case "f":
				converted = 5 * (degrees - 32) /9;
				System.out.println(degrees + " degrees F = " + converted + " degrees Celsius");
				break;
				
			case "C": case "c":
				converted = degrees * 9/5 + 32;
				System.out.println(degrees + " degrees C = " + converted + " degrees Fahrenheit");
				break;
				
			default:
				System.out.println("You have entered an incorrect scale. This program will now end");
				System.exit(0);
		}



	}

}

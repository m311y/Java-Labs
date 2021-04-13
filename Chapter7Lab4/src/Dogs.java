/**
 * @author Melissa
 * @date 04/02/2021
 * @purpose create methods and attributes pertaining to all breeds of dogs
 */

import java.util.Scanner;

public class Dogs {
	String dogName, dogClass, dogBreed;
	int numberOfRibbons, numberOfShows;
	
	public void setName(String newName)
	{
		dogName = newName;
	}
	
	public void setClass(String newClass)
	{
		dogClass = newClass;
	}
	
	public void setBreed(String newBreed)
	{
		dogBreed = newBreed;
	}
	
	public void setNumberOfRibbons(int newNumberOfRibbons)
	{
		numberOfRibbons = newNumberOfRibbons;
	}
	
	public void setNumberOfShows(int newNumberOfShows)
	{
		if(newNumberOfShows <= 0)
			System.out.println("Please enter a number greater than zero. If this is the first show the dog has participated in enter 1");
		else
			numberOfShows = newNumberOfShows;
	}
	
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter name of dog");
		dogName = keyboard.nextLine();
		System.out.println("Enter breed of dog");
		dogBreed = keyboard.nextLine();
		System.out.println("Enter class dog participates in (sporting, toy, etc.)");
		dogClass = keyboard.nextLine();
		System.out.println("Enter number of ribbons dog has earned");
		numberOfRibbons = keyboard.nextInt();
		System.out.println("Enter number of shows dog has been in, including this one");
		numberOfShows = keyboard.nextInt();
		
		while(numberOfShows <= 0)
		{
			System.out.println("Number must be greater than zero");
			System.out.println("Enter number of shows the dog has been in, including this one");
			numberOfShows = keyboard.nextInt();
		}
	}
	
	public void writeOutput()
	{
		System.out.println("\n\nDog's name is " + dogName);
		System.out.println("Dog's class is " + dogClass);
		System.out.println("Dog's breed is " + dogBreed);
		System.out.println(dogName + " has won " + numberOfRibbons + " ribbons");
		if(numberOfShows == 1)
			System.out.println("This is " + dogName + "\'s first show");
		else
			System.out.println(dogName + " has participated in " + numberOfShows + " shows");
	}
	
	public String getName()
	{
		return dogName;
	}
	
	public String getClassOfDog()
	{
		return dogClass;
	}
	
	public String getBreed()
	{
		return dogBreed;
	}
	
	public int getNumberOfRibbons()
	{
		return numberOfRibbons;
	}
	
	public int getNumberOfShows()
	{
		return numberOfShows;
	}

}

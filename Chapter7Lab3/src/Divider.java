
/**
 * @author Melissa
 * @date 04/02/2021
 * @purpose 
 */

import java.util.Scanner;

public class Divider {
	
	private int divider;
	private double correct;
	private double count;
	private double incorrect;
	private double answer;
	
	private Scanner keyboard = new Scanner(System.in);

	
	public void welcome()
	{
		System.out.println("\nTest your skills at Division without using a calculator");
	}
	
	public int getDivider()
	{
		System.out.println("\nEnter the division table you wan to test yourself on:\n");
		divider = keyboard.nextInt();
		return divider;
	}
	
	public double getCorrect()
	{
		while(count <= 12)
		{
			System.out.println("\nWhat is " + count + " divided by " + divider + "(you must answer using 18 decimal places if the answer is not exact)?\n");
			answer = keyboard.nextDouble();
			
			if(answer == count/divider)
			{
				System.out.println("\nCorrect!");
				count++;
				correct++;
			}
			else
				System.out.println("\nIncorrect!");
		}
		return correct;
	}
	
	public void display()
	{
		System.out.println("\nYou got " + correct + " correct\n");
		System.out.println("\nYou got " + incorrect + " incorrect\n");
		
		
		}
	
	public void setValues(double resetCorrect, double resetCount)
	 {
		correct = resetCorrect;
		count = resetCount;
	 }

	

}

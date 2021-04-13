/**
 * @author Melissa Hardwick
 * @date 04/02/2021
 * @purpose The purpose of this program is to test different methods in the Math class.
 *
 */


// Imports
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MathDemo {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choice = 0;
		boolean done = false;
		String answer;
		
		while(done == false)
		{
			answer = JOptionPane.showInputDialog(null,"Choose from the following menu\n\n1)Test your skills for absolute values\n\n2) Test your skills rounding off numbers\n\n3)Test your skills finding the square root of a number\n\n4) Test your skills on minimum numbers \n\n5) Test your skills on maximum numbers \n\n 6) Find the smallest integer that is greater than a given number \n\n 7) Find the largest integer that is less than a given number \n\n 8) Find the value of the power of a number\n\n9)Find the value of a number multiplied by pi \n\n10) Quit the program\n\n ");
			if((answer == null) || (answer.length() == 0))
			{
				JOptionPane.showMessageDialog(null, "You have pressed either OK without entering data or pressed the cancel button.\nThis will end the program. Goodbye.");
				System.exit(0);
			}
			else
				choice = Integer.parseInt(answer);
			
			switch(choice)
			{
			 case 1:
			 MathTest.getAbsoluteValue();
			 break;
			 
			 case 2:
			 MathTest.getRoundValue();
			 break;
			 
			 case 3:
			 MathTest.getSquareRoot();
			 break;
			 
			 case 4:
			 MathTest.getMinimum();
			 break;
			 
			 case 5:
			 MathTest.getMaximum();
			 break;
			 
			 case 6:
			 MathTest.getCeil();
			 break;
			 
			 case 7:
			 MathTest.getFloor();
			 break;
			 
			 case 8:
			 MathTest.getPowerValue();
			 break;
			 
			 case 9:
			 MathTest.getPI();
			 break;
			 
			 case 10:
			 done = true;
			 break;
			 
			 default:
			 JOptionPane.showMessageDialog(null, "You must choose 1-10");
			}

		}

	}

}

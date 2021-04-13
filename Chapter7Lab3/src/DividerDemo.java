import java.util.Scanner;

/**
 * @author Melissa
 * @date 04/02/2021
 * @purpose 
 */

import java.util.Scanner;

public class DividerDemo {

	public static void main(String[] args) {
		int divider;
		double correct;
		char answer;
		
		Scanner keyboard = new Scanner(System.in);
		
		Divider test = new Divider();
		test.welcome();
		divider = test.getDivider();
		correct = test.getCorrect();
		test.display();
		
		if(correct < 13)
		 {
			test.setValues(0, 0);
			System.out.println("Do you wish to try again? Y/N");
			answer = keyboard.next().charAt(0);
			
			if(answer == 'Y' || answer == 'y')
			{
				test.getDivider();
				correct = test.getCorrect();
			}
		}


	}
	

}

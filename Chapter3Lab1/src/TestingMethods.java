		/*
		 Program: TestingMethods.java
		 Programmer: Vicky Hardin
		 Purpose: To test the charAt() method, substring(), trim(), indexOf(),
		 toUpperCase(), toLowerCase(), length(), equalsIgnoreCase(),lastIndexOf()
		*/

public class TestingMethods {

	public static void main(String[] args) {

		
		String message,message2,message3,entry;
		message = "A long time ago, in a galaxy far, far, away";
		message2 = "      A long time ago, in a galaxy far, far, away      ";
		message3=message;
		entry = "adventure";


		
		//testing the length() method
		System.out.println(message.length());
		
		//testing the equalsIgnoreCase() method. Since it doesn't match returns false
		System.out.println(message.equalsIgnoreCase("A long time ago"));
		
		//testing the toLowerCase() method
		System.out.println(message.toLowerCase());
		
		//testing the toUpperCase() method
		System.out.println(message.toUpperCase());
		
		//testing the trim() method
		System.out.println(message2.trim());
		
		//testing the charAt() method
		System.out.println(message2.charAt(10));
		System.out.println(message2.charAt(20));
		
		//testing the substring() method
		System.out.println(message2.substring(10));
		System.out.println(message2.substring(25));
		
		//testing the substring(Start, End) method
		System.out.println(message2.substring(10,25));
		System.out.println(message2.substring(5,30));
		
		//testing the indexOf() method
		System.out.println(message2.indexOf("far"));
		System.out.println(message2.indexOf("Melissa"));
		
		//testing the indexOf(A_String, Star) method
		System.out.println(message2.indexOf("galaxy",10));
		System.out.println(message2.indexOf("Melissa",2));
		
		//testing the lastIndexOf() method
		System.out.println(message2.lastIndexOf("far"));
		System.out.println(message2.lastIndexOf("Melissa"));
		
		//testing the compareTo() method
		System.out.println(message3.compareTo("far"));
		System.out.println(message3.compareTo(message2));
		System.out.println(message3.compareTo(message));
		System.out.println(entry.compareTo("zoo"));









	}

}

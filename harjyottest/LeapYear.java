package harjyottest;

import java.util.Scanner; 

public class LeapYear {

	public void checkLeapYear() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the year : ");
	    int year = myObj.nextInt();  // Read user input
	    System.out.println("Year entered is: " + year);  // Output user input
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{		
			System.out.println("The Year "+ year + " is a leap year");
		}
		else 
		{
		System.out.println("The Year " + year + " is not a leap year");
		}	
	}
	public static void main(String[] args) {
		LeapYear ly = new LeapYear();
		ly.checkLeapYear();	
	}
}

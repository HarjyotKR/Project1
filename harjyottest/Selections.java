package harjyottest;

import java.lang.StackWalker.Option;
import java.util.Scanner;

public class Selections {
	
	public void options() {
		
		System.out.println("Enter your selection \r\n"
				+ "1 - Area of Rectangle\r\n"
				+ "2 - Perimeter of Rectange\r\n"
				+ "3 - Area of Square\r\n"
				+ "4 - Perimeter of Square \r\n"
				+ "5 - Area of Circle \r\n"
				+ "6 - Perimeter of Circle \r\n"
				+ "any other value - Invaild choice\r\n");

		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println("Enter the integer 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter the integer 2 : ");
		int b = sc.nextInt();
		
		//value is for switch
		// a and b are for calculations
		
		switch (value) {
		  case 1:
		    System.out.println("Area of the rectangle is: " + area(a,b));
		    break;
		  case 2:
		    System.out.println("Perimeter of Rectange" + perm(a,b));
		    break;
		  case 3:
		    System.out.println("Area of Square " + areasq(a));
		    break;
		  case 4:
		    System.out.println("Perimeter of Square " + permsq(a));
		    break;
		  case 5:
		    System.out.println("Area of Circle " + areacir(a) );
		    break;
		  case 6:
		    System.out.println("Perimeter of Circle " + permcir(a));
		    break;
		    default: System.out.println("Invalid Choice");
		    }
		}
	public static int area(int a, int b) {
		return a * b;
	}
	public static int perm(int a, int b) {
		return 2*a +2*b; 
	}
	public static int areasq(int a) {
		return a * a;
	}
	public static int permsq (int a) {
		return a * a;
	}
	public static float areacir(int a) {
		return (float) (3.14 * a * a) ;	
	}
	public static float permcir(int a) {
		return (float) (2 * 3.14 * a);
	}
	
public static void main(String[] args) {
		
	Selections p = new Selections();
	p.options();	
   }
}


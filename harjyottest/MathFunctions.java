package harjyottest;
import java.util.Scanner;

public class MathFunctions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First and Second Integer Value: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("The Values entered are: " + num1 + " and " + num2 );
		System.out.println("Sum of values is: " + sum(num1,num2));
		System.out.println("Difference of values is: " + difference(num1,num2));
		System.out.println("Product of values is: " + product(num1,num2));
		System.out.println("Average of values is: " + average(num1,num2));
		System.out.println("Larger value is: " + maximum(num1,num2));
		System.out.println("Smaller value is: " + minimum(num1,num2));
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int difference(int a, int b) {
		return a - b; 
	}
	public static int product(int a, int b) {
		return a * b;
	}
	public static double average (int a, int b) {
		return (a+b)/2;
	}
	public static int maximum(int a, int b) {
		return Math.max(a, b);	
	}
	public static int minimum(int a, int b) {
		return Math.min(a, b);
	}
}

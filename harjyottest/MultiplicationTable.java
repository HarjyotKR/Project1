package harjyottest;
import java.util.Scanner; 

public class MultiplicationTable {

	public void multiply() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter an integer value: ");
		int value = ip.nextInt();
		System.out.println("The entered value is: " + value);
		
		for( int i = 0; i <= 10; i = i + 1) {
			System.out.println(value + " X " + i + " = " + value*i);	
		}
	}
	public static void main(String[] args) {
		MultiplicationTable m = new MultiplicationTable();
		m.multiply();
	}
}
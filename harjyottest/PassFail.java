/*Write a Java method to get no. of marks in integer got by a student and print the grades
Conditions for marks and grades
more than 90 - A
80 -90 -> B
68- 79 -> C
55 - 67 -> D
40 - 54 -> E
less than 40 - Fail
any number outside 0 to 100 -> invalid marks

Expected Input -  Marks attained by student is 75
Expected output - Grade attained is - C*/


 package harjyottest;
   import java.util.Scanner;

 public class PassFail {
	public static void main(String[] args) { 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter marks: "); 
		 int marks = sc.nextInt();
		 calculateGrade(marks);
		}
 public static void calculateGrade(int marks) {
    if (marks < 0 || marks > 100) {
        System.out.println("Invalid marks!");
    } else if (marks >= 90) {
        System.out.println("Grade attained is A");
    } else if (marks >= 80) {
        System.out.println("Grade attained is B");
    } else if (marks >= 68) {
        System.out.println("Grade attained is C");
    } else if (marks >= 55) {
        System.out.println("Grade attained is D");
    } else if (marks >= 40) {
        System.out.println("Grade attained is E");
    } else {
        System.out.println("Grade attained is Fail");
    }
   }
 }
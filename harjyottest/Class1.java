package harjyottest;

public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String studentFristName = "Harry";
		String studentLastName = "Potter";
		int rollNum = 35;
		char batchname = 'C';
		String batchMonth = "April";
		double percentage = 75.98;
		int maths = 45;
		int science = 55;
		int total = maths + science;
		
		System.out.println("Name of the student is " + studentFristName + " " + studentLastName);
		System.out.println("ID number is " + rollNum);
		System.out.println("Batch number is " + batchname);
		System.out.println("Batch month is " + batchMonth);
		System.out.println("Math and Science total is " + total);
		System.out.println(maths+ science);
		System.out.println("Annual percentage is " + percentage + "%");
		
		/*
		try to print below -
		int + string
		int + boolean
		int + char
		String + int
		int + double
		float + double
		
		*/
		
		System.out.println(maths + batchMonth);
		
	}

}

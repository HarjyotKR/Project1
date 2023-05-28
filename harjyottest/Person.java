package harjyottest;

//class person (this has all the attributes)
//constructor is use to initialize the attributes
//method getFullName() = fstname+lastname
//printPersonInfo()  = print person's info

//main method has 2 examples of EEs John and Jane
//printPersonInfo() is called to print all infos

public class Person 
{
    private String fstName;
    private String lstName;
    private int age;
    private String country;
    private String empStatus;

    // create a constructor 
    public Person(String fstName, String lstName, int age, String country, String empStatus) 
    {
    	this.fstName = fstName;
    	this.lstName = lstName;
    	this.age = age;
    	this.country = country;
    	this.empStatus = empStatus;
    }
    public String getFullName() {
    	return fstName + " " + lstName;
    }
    
    public void printPersonInfo() {
    	
    	System.out.println("Person Name is : " + getFullName());
    	System.out.println(fstName + "'s age is: " + age);
    	System.out.println(fstName + " resides in " + country);
    	System.out.println(fstName + " is working " + empStatus + " at ABC company" );
   
    }
    
    public class print {

        public static void main(String[] args) {
            Person john = new Person("John", "Doe", 35, "Canada", "Full time");
            Person jane = new Person("Jane", "Smith", 28, "United States", "Part time");

            john.printPersonInfo();
            System.out.println();
            jane.printPersonInfo();
        }  
    }
    
}

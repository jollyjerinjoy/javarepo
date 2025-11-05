package assignments;

public class Gradeif {

	    public static void main(String[] args) {
	        int marks = 60; // set the marks here

	        if (marks < 40) {
	            System.out.println("Grade: Failed");
	        } else if (marks <= 60) {
	            System.out.println("Grade: D");
	        } else if (marks <= 70) {
	            System.out.println("Grade: C");
	        } else if (marks <= 80) {
	            System.out.println("Grade: B");
	        } else if (marks <= 100) {
	            System.out.println("Grade: A");
	        } else {
	            System.out.println("Invalid marks entered.");
	        }
	    
	}
	
}

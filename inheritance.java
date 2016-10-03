// HackerRank inheritance

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

	int avg=0;
	String grade;

	Student(String firstName, String lastName, int identification, int[] testScores2) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		testScores = testScores2;
		
		
	}

	
    public String calculate(){
    	for (int i = 0; i<testScores.length;i++){
    		avg = avg + testScores[i];
    	}
    	if (avg/testScores.length>89)
    		grade ="O";
    		else if (avg/testScores.length>79)
    			grade = "E";
    		else if (avg/testScores.length>69)
    			grade ="A";
    		else if (avg/testScores.length>54)
    			grade="P";
    		else if (avg/testScores.length>39)
    			grade ="D";
    		else 
    			grade ="T";
    	
    	return grade;
        
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}

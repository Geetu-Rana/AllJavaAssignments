package day10Assignment2;

import java.util.Scanner;


public class AllStudent{
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Is Student from Science branch the nWrite True else false");
		boolean studentisFromSic = sc.nextBoolean();
		if(studentisFromSic == true) {
			ScienceStudent s1 = new ScienceStudent();
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter Name");
			s1.name =sc1.next();
			
			System.out.println("Enter Address");
			s1.address = sc1.next();
			
			System.out.println("Enter physics Marks");
			s1.physicsMarks = sc1.nextInt();
			
			System.out.println("Enter Chemistry Marks");
			s1.chemistryMarks =sc1.nextInt();
			
			System.out.println("Enter Maths Marks");
			s1.mathsMarks = sc1.nextInt();
			
			System.out.println("Name: "+ s1.name);
			System.out.println("Address: "+ s1.address);
			System.out.println("Physics Marks: "+ s1.physicsMarks);
			System.out.println("Maths Marks: "+s1.mathsMarks);
			System.out.println("Chemistry Marks"+s1.chemistryMarks);
			System.out.println("Percentage is : "+s1.getPercentage());
			sc1.close();
		}else {
			Scanner sc1 = new Scanner(System.in);
			HistoryStudent h1 = new HistoryStudent();
					
			System.out.println("Enter Name");
			h1.name =sc1.next();
			
			System.out.println("Enter Address");
			h1.address = sc1.next();
			
			System.out.println("Enter History Marks");
			h1.historyMarks = sc1.nextInt();
			
			System.out.println("Enter Civics Marks");
			h1.civicsMarks =sc1.nextInt();
			
			System.out.println("Name: "+ h1.name);
			System.out.println("Address: "+ h1.address);
			System.out.println("History Marks: "+ h1.historyMarks);
			System.out.println("Civics Marks: "+h1.civicsMarks);
			System.out.println("Total Percentage :"+h1.getPercentage());
			sc1.close();
		}
		sc.close();
	}
}

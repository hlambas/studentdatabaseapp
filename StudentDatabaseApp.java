package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		
		// Ask how many new students we want to add
		System.out.print("Enter number of new students to ennroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
				
		//Creearing an array of ojects
		//Create n number of new students
		for(int n=0; n<numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			//System.out.println(students[n].toString());
			
		}
		for (int n=0; n<numOfStudents; n++) {
		System.out.println(students[n].toString());
		//System.out.println(students[0].toString());
		//System.out.println(students[2].toString());
		//System.out.println(students[3].toString());
		}
	}

}
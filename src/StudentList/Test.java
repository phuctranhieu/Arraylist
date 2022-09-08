package StudentList;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		StudentList dssv = new StudentList();
		int choice = 0;
		do {
			System.out.println("MENU---------");
			System.out.println("Please Select: ");
			System.out.println(
			  "1.	Add Student to the list.\n"
			+ "2.	Print the list on screen.\n"
			+ "3.	Check if the list is empty.\n"
			+ "4.	Number of student on the list.\n"
			+ "5.	Empty the list.\n"
			+ "6.	Check if the student exist, base on the student id.\n"
			+ "7.	Delete a student base on the student id.\n"
			+ "8.	Find all the student name.\n"
			+ "9.	Output a list of students with high to low scores.\n"
			+ "0.	Exit");	
			choice = sc.nextInt();
			sc.nextLine();		
			
			if(choice==1) {
				System.out.println("Input student id: "); String studentID = sc.nextLine();
				System.out.println("Input name: "); String name = sc.nextLine();
				System.out.println("Input date of birth: "); int dateOfBirth = sc.nextInt();
				System.out.println("Input score: "); float score = sc.nextFloat();	
				Student sv = new Student(studentID, name, dateOfBirth, score);
				dssv.addStudent(sv);
				
			}else if(choice==2) {
				dssv.printStudentList();
				
			}else if(choice==3) {
				
				System.out.println("List is empty: "+dssv.checkEmptylist());
				
			}else if(choice==4) {	
				
				System.out.println("Current number: "+dssv.getTheNumberOfStudent());
				
			}else if(choice==5) {	
				
				dssv.emptyTheListOfStudent();
				
			}else if(choice==6) {	
				
				System.out.println("Input Student ID: "); String studentID = sc.nextLine();
				Student sv = new Student(studentID);
				System.out.println("Check if the Student is in the list:"+dssv.checkForExistence(sv));
	
			}else if(choice==7) {
			
				System.out.println("Input Student ID: "); String studentID = sc.nextLine();
				Student sv = new Student(studentID);
				System.out.println("Delete the student in the list:"+dssv.deleteStudent(sv));
				
			}else if(choice==8) {	
				
				System.out.println("Input name: "); String name = sc.nextLine();
				System.out.println("Search: ");
				dssv.findStudent(name);
				
			}else if(choice==9) {	
				
			dssv.sortstudentdescendingorderbygrade();
			dssv.printStudentList();
			}
		
			
		}while(choice!=0);
		}
}
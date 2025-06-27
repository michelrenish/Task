package task_2;

import java.util.Scanner;

public class UpdateStudent {
	
	static void updateStudent() {
		 Scanner sc = new Scanner(System.in);
		
	        System.out.print("Enter Roll No to update: ");
	        int rollNo = sc.nextInt();
	        sc.nextLine();

	        for (Student s : ViewAndSearch.students) {
	            if (s.getRollNo() == rollNo) {
	                System.out.print("Enter new Name: ");
	                s.setName(sc.nextLine());

	                System.out.print("Enter new Age: ");
	                s.setAge(sc.nextInt());
	                sc.nextLine();

	                System.out.print("Enter new Course: ");
	                s.setCourse(sc.nextLine());

	                System.out.println("Student updated successfully.");
	                return;
	            }
	        }

	        System.out.println("Student not found.");
	    }

}

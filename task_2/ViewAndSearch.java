	package task_2;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	
	public class ViewAndSearch {
		static List<Student> students = new ArrayList<Student>();
		
		   static void viewStudents() {
		        if (students.isEmpty()) {
		            System.out.println("No student records found.");
		        } else {
		            System.out.println("\nAll Students:");
		            for (Student s : students) {
		                System.out.println(s);
		            }
		        }
		    }
		  
		   static void searchStudent() {
			  Scanner sc = new Scanner(System.in);
		        System.out.print("Enter Roll No to search: ");
		        int rollNo = sc.nextInt();
	
		        for (Student s : students) {
		            if (s.getRollNo() == rollNo) {
		                System.out.println("Student Found: " + s);
		                return;
		            }
		        }
	
		        System.out.println("Student not found.");
		    }
	
	}

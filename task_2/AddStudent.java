package task_2;

import java.util.*;

public class AddStudent {
	
	static List<Student> students = new ArrayList<>();
    static void addStudent() {
    	 
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

    
		for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println("Student with this roll number already exists.");
                return;
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        ViewAndSearch.students.add(new Student(rollNo, name, age, course));
        System.out.println("Student added successfully.");
    }
}

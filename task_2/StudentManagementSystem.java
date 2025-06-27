package task_2;
import java.util.*;

public class StudentManagementSystem {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> AddStudent.addStudent();
                case 2 -> ViewAndSearch.viewStudents();
                case 3 -> ViewAndSearch.searchStudent();
                case 4 -> UpdateStudent.updateStudent();
                case 5 -> DeleteStudent.deleteStudent();
                case 6 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }
}

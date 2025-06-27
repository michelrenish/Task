package task_2;

import java.util.*;
public class DeleteStudent {

    static void deleteStudent() {
    
    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No to delete: ");
        int rollNo = sc.nextInt();

        Iterator<Student> iterator = ViewAndSearch.students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getRollNo() == rollNo) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

}

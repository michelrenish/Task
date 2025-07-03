package task_7;

import java.util.List;
import java.util.Scanner;

public class EmployeeDBApp {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee\n2. View All\n3. Update\n4. Delete\n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); 
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    dao.addEmployee(new Employee(0, name, dept, salary));
                    break;

                case 2:
                    List<Employee> employees = dao.getAllEmployees();
                    System.out.println("ID\tName\tDepartment\tSalary");
                    for (Employee e : employees) {
                        System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getDepartment() + "\t" + e.getSalary());
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    name = sc.nextLine();
                    System.out.print("New Department: ");
                    dept = sc.nextLine();
                    System.out.print("New Salary: ");
                    salary = sc.nextDouble();
                    dao.updateEmployee(new Employee(id, name, dept, salary));
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    dao.deleteEmployee(delId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}

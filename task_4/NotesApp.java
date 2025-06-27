package task_4;

import java.util.Scanner;

public class NotesApp {
	public static void main(String[] args) {
        NotesManager notesManager = new NotesManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Notes App ---");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your note: ");
                    String note = scanner.nextLine();
                    notesManager.addNote(note);
                    break;
                case 2:
                    notesManager.viewNotes();
                    break;
                case 3:
                    System.out.println("Exiting Notes App.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}

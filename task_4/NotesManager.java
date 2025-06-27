package task_4;

import java.io.*;

public class NotesManager {
    private static final String FILE_NAME = "notes.txt";

    public void addNote(String note) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(note + "\n");
            System.out.println("Note saved!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public void viewNotes() {
        System.out.println("\n--- Your Notes ---");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            int count = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(count++ + ". " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes found. Start by adding one!");
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

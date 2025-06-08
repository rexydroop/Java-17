import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskTracker {
    public static final String ANSI_DARK_GRAY = "\u001B[38;5;240m";

    public static void main(String[] args) {
        taskTracker(); //Call method
    }

    public static void taskTracker() {
        Scanner scanner = new Scanner(System.in); //Create an object of type Scanner
        File file = new File("Tasks.txt"); //Create an object of type File

        System.out.println("\n--- Task Tracker ---\n");
        System.out.println("Type 'exit' to quit");
        System.out.println("Type 'clear' to delete all previous tasks\n");

        while (true) {
            System.out.print("Task: ");
            String task = scanner.nextLine();

            if (task.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye"); //Print Goodbye
                break; //Exit loop
            }
            if (task.equalsIgnoreCase("clear")) {
                clearFile(file); //Clear file
                continue; //Restart
            }

            System.out.print("Due: ");
            String due = scanner.nextLine();
            System.out.println();

            try {

                file.createNewFile(); //Creates new file
                FileWriter writer = new FileWriter(file, true); //Create an instance of the FileWriter class

                writer.write(task + " | " + due + "\n");//Write user input to created file
                writer.flush(); //Flush the input stream

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void clearFile(File file) {
        try {
            FileWriter clearer = new FileWriter(file, false); //Create an instance of FileWriter
            clearer.write(""); //Clear all input
            clearer.close(); //Close the writer
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
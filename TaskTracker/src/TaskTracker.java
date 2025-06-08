import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskTracker {
    static Scanner scanner = new Scanner(System.in);
    static File file = new File("Tasks.txt");

    public static final String ANSI_DARK_GRAY = "\u001B[38;5;240m";

    public static void main(String[] args) {
        taskTracker();
    }

    public static void taskTracker() {
        System.out.println("--- Task Tracker ---");
        System.out.println("Type 'exit' to quit");
        System.out.println("Type 'clear' to delete all previous tasks");
        System.out.println("Type task number to access task");
        System.out.println("Type anything else to enter a new task");

        while (true) {
            String input = scanner.nextLine();
            try {
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("Goodbye");
                    break; //Exit loop
                }
                if (input.equalsIgnoreCase("clear")) {
                    clearFile(input); //Clear file
                    continue;//Skip following code
                }

                file.createNewFile(); //Creates new file
                FileWriter writer = new FileWriter(file, true); //Create an instance of the FileWriter class

                writer.write("Task: " + input + "\n");//Write user input to created file
                writer.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void clearFile(String input) {
        try {
            FileWriter clearer = new FileWriter(file, false);
            clearer.write("");//Clear all input
            clearer.close();//Close the writer
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
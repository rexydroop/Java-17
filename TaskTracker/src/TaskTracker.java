import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaskTracker {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[92m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        taskTracker(); //Call method
    }

    public static void taskTracker() {
        Scanner scanner = new Scanner(System.in); //Create an object of type Scanner
        File file = new File("C:/Users/Zain Haroon/Downloads/Github/TaskTracker/src/Tasks.txt"); //Create an object of type File

        System.out.println("\n--- Task Tracker ---\n");
        System.out.println("Type 'exit' to quit");
        System.out.println("Type 'clear' to delete all previous tasks");
        System.out.println("Type 'tasks' to display all previous tasks\n");

        while (true) {
            System.out.print("Task: ");
            String task = scanner.nextLine();

            if (task.equalsIgnoreCase("exit")) {
                System.out.println("- " + ANSI_GREEN + "Goodbye" + ANSI_RESET + " -"); //Print Goodbye
                break; //Exit loop
            }
            if (task.equalsIgnoreCase("clear")) {
                clearFile(file); //Clear file
                System.out.println("--- " + ANSI_RED + "All tasks have been cleared!" + ANSI_RESET);
                continue; //Restart
            }
            if (task.equalsIgnoreCase("tasks")) {
                printFile(file); //print all tasks in the file
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

    public static void printFile(File file){
        try {
            Scanner reader = new Scanner(file);
            if (!reader.hasNextLine()){
                System.out.println("--- " + ANSI_RED + "No tasks have been saved!" + ANSI_RESET);
            }
            int taskNumber = 1;
            while (reader.hasNextLine()){
                System.out.println("--- Task #" + taskNumber + ": " + ANSI_BLUE + reader.nextLine() + ANSI_RESET);
                taskNumber++;
            }
        }catch (FileNotFoundException notFoundException){
            System.out.println("--- " + ANSI_RED + "File was not found!" + ANSI_RESET);
            notFoundException.printStackTrace();
        }


    }
}
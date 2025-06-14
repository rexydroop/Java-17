import java.io.*;
import java.util.Scanner;

public class TaskTracker {
    static final String RED = "\u001B[31m", BLUE = "\u001B[36m", GREEN = "\u001B[92m", CLEAR = "\u001B[0m";
    static final String noTasks = "-- " + RED + "No tasks have been saved!" + CLEAR, notFound = "-- " + RED + "File was not found!" + CLEAR;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File(System.getProperty("user.dir") + "/Tasks.txt");

        System.out.println("\n--- Task Tracker ---\nType 'exit' to quit\nType 'clear' to delete all tasks\nType 'tasks' to show all tasks\nType anything else to save a task\n");

        while (true) {
            System.out.print("Task: ");
            String task = sc.nextLine();

            if (task.equalsIgnoreCase("exit")) {
                System.out.println("- " + GREEN + "Goodbye" + CLEAR + " -");
                break;
            } else if (task.equalsIgnoreCase("clear")) {
                file.delete();
                System.out.println("-- " + RED + "All tasks cleared!" + CLEAR);
            } else if (task.equalsIgnoreCase("tasks")) {
                printFile(file);
            } else {
                System.out.print("Due: ");
                String due = sc.nextLine();

                try (FileWriter writer = new FileWriter(file, true)) {
                    file.createNewFile();
                    writer.write(task + " | " + due + "\n");
                } catch (IOException e) {
                    System.out.println(notFound);
                }
                System.out.println();
            }
        }
    }

    static void printFile(File file) {
        try (Scanner reader = new Scanner(file)) {
            for (int i = 1; reader.hasNextLine(); i++)
                System.out.println("-- Task #" + i + ": " + BLUE + reader.nextLine() + CLEAR);
        } catch (FileNotFoundException e) {
            System.out.println(noTasks);
        }
    }
}
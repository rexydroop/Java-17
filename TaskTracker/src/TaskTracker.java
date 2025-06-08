import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class TaskTracker {
    public static void main(String[] args) throws IOException {
        taskTracker();
    }

    public static String taskTracker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Task Tracker ---");
        System.out.println("Type 'exit' to quit");
        System.out.println("Type task number to access task");
        System.out.println("Type anything else to enter a new task\n");

        int taskNumber = 0;
        int targetLine = 1;

        File file = new File("Tasks.txt");
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file, true);
            FileReader fileReader = new FileReader(file);

            while (true) {
                taskNumber++;
                System.out.print("Task #" + taskNumber + ": ");
                String input = scanner.nextLine();

                if (Objects.equals(input, "exit")) {
                    fileWriter.close();  // flushes and saves the file
                    System.out.println("Goodbye");
                    break;
                }
                if (Objects.equals(input, taskNumber)){
                     targetLine = taskNumber;
                }

                fileWriter.write("Task #" + taskNumber + ": " + input + System.lineSeparator());
                fileWriter.flush();  // flush after each write (optional but safe)

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Done";
    }
}

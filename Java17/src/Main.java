import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "document.txt";

        // Create a File object
        File file = new File(fileName);

        try {
            // Try to create the file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}

import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        minAndMax();
    }

    public static String minAndMax(){
        Scanner scanner = new Scanner(System.in);

        boolean isNumber = true;

        while (isNumber) {
            System.out.println("Enter a number, or any character to quit");
            try {
                double value = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException characterData) {
                isNumber = false;
            }

        }
        return "";
    }

}

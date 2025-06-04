import java.util.Scanner;

public class AgeCalculator {
    private static final int currentYear = 2025;
    public static void main(String[] args) {
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (Exception e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear){
        int yearOfBirth = Integer.parseInt(System.console().readLine("What year were you born?"));
        int age = currentYear - yearOfBirth;
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        boolean validDOB = false;
        int age = 0;
        do {
            try {
                System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and, <= " + currentYear);
                age = checkData(currentYear, scanner.nextLine());
                validDOB = age >= 0;
            }catch (NumberFormatException badUserData){
                System.out.println("No characters allowed! Try again");
            }

        }while (!validDOB);
        return "So you are " + age + " years old";

    }

    public static int checkData(int currentYear, String yearOfBirth){
        int YOB = Integer.parseInt(yearOfBirth);
        int minimumYear = currentYear - 125;
        if (YOB > currentYear || YOB < minimumYear){
            return -1;
        }
        return currentYear - YOB;
    }

}

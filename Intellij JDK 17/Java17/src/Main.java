import java.util.Scanner;

public class Main {
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

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What year were you born? ");
        int yearOfBirth = Integer.parseInt(scanner.nextLine());
        int age = currentYear - yearOfBirth;
        return "So you are " + age + " years old";
    }
}

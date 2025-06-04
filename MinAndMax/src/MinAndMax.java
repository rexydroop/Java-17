import java.util.Scanner;

public class MinAndMax {
    static double prevMax = 0;
    static double prevMin = 0;
    public static void main(String[] args) {
        System.out.println(minAndMax());
    }

    public static String minAndMax(){
        Scanner scanner = new Scanner(System.in);

        double maxValue = 0;
        double minValue = 0;

        while (true){
                try {
                    System.out.println("Enter a number, or any character to quit");
                    String input = scanner.nextLine();
                    maxValue = Maximum(Double.parseDouble(input));
                    minValue = Minimum(Double.parseDouble(input));
                } catch (NumberFormatException characterData) {
                    break;
                }
        }
        return "Max: " + maxValue + ", Min: " + minValue;
    }

    public static double Maximum(double number){
        if (number > prevMax){
            prevMax = number;
        }
        return prevMax;
    }

    public static double Minimum(double number){
        if (number < prevMin){
            prevMin = number;
        }
        return prevMin;
    }

}

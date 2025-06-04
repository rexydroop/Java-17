import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg;
        int loopCount = 0;

        while (true){

            try {
                String input = scanner.nextLine();
                sum += Integer.parseInt(input);
                loopCount++;
            }catch (NumberFormatException nfe){
                break;
            }
        }
        try {
            avg = Math.round((double) sum / loopCount);
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }catch (ArithmeticException noUserData){
            System.out.println("Invalid Data!");
        }
    }
}

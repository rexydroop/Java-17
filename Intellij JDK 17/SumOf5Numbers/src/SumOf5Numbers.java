import java.util.Scanner;

public class SumOf5Numbers {
    public static void main(String[] args) {
        sumOf5Numbers();
    }

    public static void sumOf5Numbers() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0;

        System.out.println("\n--- Enter 5 numbers ---");
        while (count <= 5) {
            System.out.print("Enter number #" + count + ": ");
            try {
                double value = Double.parseDouble(scanner.nextLine());
                count++;
                sum += value;
            }catch (NumberFormatException badUserData){
                System.out.println("❌ Invalid input! Only integers allowed");
            }
        }
        System.out.println("The sum of your chosen numbers is: " + sum);
        System.out.println(23);



    }

}

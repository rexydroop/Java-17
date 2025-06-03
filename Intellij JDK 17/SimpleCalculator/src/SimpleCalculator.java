public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Your result is: " + calculate(80,2 , '*'));
    }

    public static long calculate(long num1, long num2, char operator){
        switch (operator){
            case '+' -> {
                return num1 + num2;
            }
            case '-' -> {
                return num1 - num2;
            }
            case '*' -> {
                return num1 * num2;
            }
            case '/' -> {
                return num1 / num2;
            }
            default -> {
                return 0;
            }
        }
    }
}

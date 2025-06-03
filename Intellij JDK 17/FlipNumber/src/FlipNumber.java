public class FlipNumber {
    public static void main(String[] args) {
        int number = 125;
        int digit;
        while (number >= 1){
            digit = number % 10;
            number /= 10;
            System.out.print(digit);

        }
    }

}


public class SumDigitsInANumber {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits(int number){
        if (number < 0){
            return -1;
        }
        int sum = 0;

        while (number >= 1) {
            sum += number % 10;
            number = number / 10; // 12.5
        }


        return sum;

    }
}


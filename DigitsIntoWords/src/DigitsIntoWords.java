public class DigitsIntoWords {
    public static void main(String[] args) {
        numberToWords(0);
        System.out.println(reverse(1000));
        System.out.println(getDigitCount(0));
    }

    public static void numberToWords(int number){

        if (number < 0){
            System.out.println("Invalid Value");
        }

        if (number == 0){
            System.out.println("Zero");
        }

        int difference = getDigitCount(number) - getDigitCount(reverse(number));

        number = reverse(number);

        while (number > 0){
            int digit = number % 10;

            switch (digit){
                case 0 -> {System.out.println("Zero");}
                case 1 -> {System.out.println("One");}
                case 2 -> {System.out.println("Two");}
                case 3 -> {System.out.println("Three");}
                case 4 -> {System.out.println("Four");}
                case 5 -> {System.out.println("Five");}
                case 6 -> {System.out.println("Six");}
                case 7 -> {System.out.println("Seven");}
                case 8 -> {System.out.println("Eight");}
                case 9 -> {System.out.println("Nine");}
            }
            number /= 10;
        }
        for (int i = 0; i < difference; i++){
            System.out.println("Zero");
        }


    }

    public static int reverse(int number){
        int reverse = 0;
        while (number != 0){
            reverse *= 10;
            int digit = number % 10;
            reverse += digit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }

        if (number == 0){
            return 1;
        }

        int sum = 0;
        while (number > 0){
            sum++;
            number /= 10;
        }
        return sum;
    }
}

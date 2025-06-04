public class SumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int original = number;
        int digit = number % 10;
        while (original > 0 && original >= 10){
            original /= 10;
        }
        return digit += original;

    }

}

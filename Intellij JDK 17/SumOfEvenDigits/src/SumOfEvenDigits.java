public class SumOfEvenDigits {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2000));
    }
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;  
        }
        int original = number;
        int digit = 0;
        int sum = 0;
        while (original != 0){
            digit = original % 10;
            if (digit % 2 == 0){
                sum += digit;
            }
            original /= 10;

        }
        return sum;
    }
}

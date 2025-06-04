public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(8));
    }
    public static int getLargestPrime(int number){
        if (number < 2){
            return -1;
        }

        int factor = -1;

        for (int divisor = 2; divisor * divisor <= number; divisor++){
            if (number % divisor != 0){
                continue;
            }// factor = divisor
            factor = divisor;
            while (number % factor == 0){
                number /= factor;
            }
        }
        return number == 1 ? factor : number;

    }


}

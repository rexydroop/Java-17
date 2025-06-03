public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(425, 245));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        int min = first < second ? first : second;
        int gcd = 0;
        for (int i = 1; i <= min; i++){

            if (first % i == 0 && second % i == 0){
                gcd = i;
            }


        }
        return gcd;

    }
}

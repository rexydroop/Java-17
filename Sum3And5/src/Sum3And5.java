public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int factors = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
                factors++;
                System.out.println("Factors of 3 and 5 are: " + i);
            }
            if (factors == 5){
                break;
            }
        }
        System.out.println("Sum of the factors of 3 and 5 are: " + sum);
    }
}

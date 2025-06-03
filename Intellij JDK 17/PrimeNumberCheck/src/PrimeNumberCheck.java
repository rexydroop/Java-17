public class PrimeNumberCheck {
    public static void main(String[] args) {
        int primeCounter = 0;
        for (int myNumber = 0; myNumber <= 100; myNumber++){
            if (isPrime(myNumber)){
                System.out.println(myNumber + " Is a prime number");
                primeCounter++;
            }
            if (primeCounter == 3){
                break;
            }

        }
        System.out.println("There are " + primeCounter + " prime numbers from 0 to 1000");
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }

        }
        return true;
    }


}

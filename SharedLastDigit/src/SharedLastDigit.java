public class SharedLastDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(123, 124, 987));
    }

    public static boolean hasSameLastDigit(int num, int num1, int num2){
        if (!isValid(num) || !isValid(num1) || !isValid(num2)){
            return false;
        }
        int firstRightDigit = num % 10;
        int secondRightDigit = num1 % 10;
        int thirdRightDigit = num2 % 10;

        if (firstRightDigit == secondRightDigit || firstRightDigit == thirdRightDigit){
            return true;
        } else return secondRightDigit == thirdRightDigit;
    }

    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }
}

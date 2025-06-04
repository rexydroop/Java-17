public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(100, 10));
    }

    public static boolean hasSharedDigit(int num, int num1){
        if (num <= 9 || num > 99){
            return false;
        }
        if (num1 <= 9 || num1 > 99){
            return false;
        }

        int firstLeftDigit = (num / 10);
        int secondLeftDigit = (num1 / 10);

        int firstRightDigit = num % 10;
        int secondRightDigit = num1 % 10;

        if (firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit){
            return true;
        }
        if (firstRightDigit == secondRightDigit || firstRightDigit == secondLeftDigit){
            return true;
        }
        return false;
    }
}

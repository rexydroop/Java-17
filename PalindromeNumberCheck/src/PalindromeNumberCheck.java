public class PalindromeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrome(999));
    }
    public static boolean isPalindrome(int number){
        int reverse = 0; // reverse initialized to last Digit of number
        int original = number;
        while (original != 0){
            reverse *= 10; // multiply reverse by 10
            reverse += original % 10;
            original /= 10;
        }

        return reverse == number;

    }
}

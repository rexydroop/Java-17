public class FindBiggestNumber {
    public static void main(String[] args) {
        System.out.println("The biggest number is: " + findMax(54, 199, 24));
    }

    public static int findMax(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3){
            return num1;
        }else if (num2 > num1 && num2 > num3){
            return num2;
        }else {
            return num3;
        }
    }
}

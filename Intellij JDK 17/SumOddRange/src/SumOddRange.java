public class SumOddRange {
    public static void main(String[] args) {
    }


    public static boolean isOdd(int number){
        if (number < 0) {
            return false;
        }else if (number % 2 != 0){
            return true;
        }else return false;

    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start < 0 && end < 0 || end < start){
            return -1;
        }
        for (start = start; start <= end;start++){
            if (isOdd(start)) {
                sum += start;
            }else if (start == end){
                break;
            }
        }
        return sum;
    }
}
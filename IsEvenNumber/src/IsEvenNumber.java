public class IsEvenNumber {
        public static void main(String[] args) {
            int number = 4;
            int finalNumber = 20;
            int evenCount = 0;
            int oddCount = 0;
            while (number <= finalNumber){
                number++;
                if (!isEvenNumber(number)){
                    oddCount++;
                    continue;
                }
                evenCount++;
                System.out.println("Even Number: " + number);
                if (evenCount >= 5){
                    break;
                }

            }
            System.out.println("Even numbers: "+ evenCount + " ,Odd Numbers: " + oddCount);
        }
        public static boolean isEvenNumber(int number){
            return number % 2 == 0;
        }


}

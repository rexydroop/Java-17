public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.println(vowelOrConsonant('A'));
    }
    public static String vowelOrConsonant(char letter){
        switch (letter){
            case 'A','a','E', 'e','I', 'i','O', 'U', 'u' -> {
                return  letter + " is a vowel";
            }
            default -> {
                return letter + " is a consonant";
            }
        }
    }
}

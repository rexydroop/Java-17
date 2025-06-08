public class Main {
    public static final String ANSI_DARK_GRAY = "\u001B[38;5;240m";
    public static void main(String[] args) {
        String input = "hello";
        System.out.println(input + ANSI_DARK_GRAY + "    id: 1");
    }
    }
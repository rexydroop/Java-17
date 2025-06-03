public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("You got : " + getGrade(100));
    }

    public static String getGrade(int percentage){
        switch (percentage){
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> {
                return "A+";
            }
            case 85, 86, 87, 88, 89 -> {
                return "A";
            }
            case 75, 76, 77, 78, 79, 80, 81, 82, 83, 84 -> {
                return "B+";
            }
            case 70, 71, 72, 73, 74 -> {
                return  "B";
            }
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 -> {
                return "C";
            }
            case 50, 51, 52, 53, 54, 55, 56, 57, 58, 59 -> {
                return "D";
            }
            case 40, 41, 42, 43, 44, 45, 46, 47, 48, 49 -> {
                return "E";
            }
            default -> {
                return "N/I";
            }
        }
    }
}

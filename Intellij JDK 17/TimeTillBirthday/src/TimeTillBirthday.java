public class TimeTillBirthday {
    public static void main(String[] args) {
        System.out.println(TimeTillBirthday());
    }

    public static String TimeTillBirthday() {
        double currentDate = 1;
        while (true) {
            //ask user for current date
            currentDate = Double.parseDouble(System.console().readLine("What is the date today? "));
            if (currentDate <= 0 || currentDate > 31 || !isWholeNumber(currentDate)) {
                System.out.println("Invalid date, try again");
                System.out.println();
            } else break;
        }

        double currentMonth = 1;
        while (true){
            //ask user for current Month
            currentMonth = Double.parseDouble(System.console().readLine("What is the month today? "));
            if (currentMonth <= 0 || currentMonth > 12 || !isWholeNumber(currentMonth)) {
                System.out.println("Invalid Month, try again");
                System.out.println();
            }else break;
        }

        //leave a line
        System.out.println();

        double dateOfBirth = 1;
        while (true) {
            //ask user for his/her date of birth
            dateOfBirth = Double.parseDouble(System.console().readLine("What is your date of birth? "));
            if (dateOfBirth <= 0 || dateOfBirth > 31 || !isWholeNumber(dateOfBirth)) {
                System.out.println("Invalid date, try again");
                System.out.println();
            } else break;
        }

        double monthOfBirth = 1;
        while (true) {
            //ask user for his/her month of birth
            monthOfBirth = Double.parseDouble(System.console().readLine("What is your month of birth? "));
            if (monthOfBirth <= 0 || monthOfBirth > 12 || !isWholeNumber(monthOfBirth)) {
                System.out.println("Invalid Month, try again");
                System.out.println();
            }else break;
        }

        //if their birthday is today
        if (dateOfBirth == currentDate && monthOfBirth == currentMonth) {
            return "Congrats! today is your birthday";
        }

        //days left till his/her birthday
        int daysRemaining = (int) currentDate;
        //months left till his/her birthday
        int monthsRemaining = (int) currentMonth;

        while (daysRemaining < dateOfBirth) {
            daysRemaining++;
        }
        while (monthsRemaining < monthOfBirth) {
            monthsRemaining++;
        }
        if (currentMonth > monthOfBirth) {
            monthsRemaining = (int) ((12 - currentMonth) + monthOfBirth);
        }
        return "So there are " + daysRemaining + " days, and " + monthsRemaining + " months, remaining till your birthday!";
    }

    public static boolean isWholeNumber(double number){
        if (number % 1 == 0){
            return true;
        }
        return false;
    }
}


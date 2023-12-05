package exercise10;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600); // 525600 min = 1 y and 0 d
        printYearsAndDays(1051200); // 1051200 min = 2 y and 0 d
        printYearsAndDays(561600); // 561600 min = 1 y and 25 d
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / (60 * 24 * 365);
        long remainingMinutes = minutes % (60 * 24 * 365);
        long days = remainingMinutes / (60 * 24);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}

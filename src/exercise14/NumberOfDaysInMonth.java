package exercise14;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020)); // 31
        System.out.println(getDaysInMonth(2, 2020)); // 29
        System.out.println(getDaysInMonth(2, 2018)); // 28
        System.out.println(getDaysInMonth(-1, 2020)); // -1
        System.out.println(getDaysInMonth(1, -2020)); // -1
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (year < 1 || year > 9999) return -1;

        return switch (month) {
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return false;
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}

package exercise11;

public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1, 1, 1); // All numbers are equal
        printEqual(1, 1, 2); // Neither all are equal or different
        printEqual(-1, -1, -1); // Invalid Value
        printEqual(1, 2, 3); // All numbers are different
    }

    public static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (first == second && second == third) {
            System.out.println("All numbers are equal");
            return;
        }
        if (first != second && second != third && first != third) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }
}

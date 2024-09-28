package exercise28;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
        }
        scanner.close();
        long average = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

}

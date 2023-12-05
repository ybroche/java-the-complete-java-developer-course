package exercise23;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // true
        System.out.println(isPerfectNumber(28)); // true
        System.out.println(isPerfectNumber(5)); // false
        System.out.println(isPerfectNumber(-1)); // false
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 1; // Incluimos 1 como divisor inicial
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                int otherDivisor = number / i;
                if (i != otherDivisor) {
                    sum += otherDivisor;
                }
            }
        }

        return sum == number;
    }
}

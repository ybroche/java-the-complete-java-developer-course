package exercise20;

public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71)); // true
        System.out.println(hasSameLastDigit(23, 32, 42)); // true
        System.out.println(hasSameLastDigit(9, 99, 999)); // false
        System.out.println(hasSameLastDigit(22, 23, 34)); // false
        System.out.println(hasSameLastDigit(10, 10, 10)); // false
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) return false;
        int aLast = a % 10;
        int bLast = b % 10;
        int cLast = c % 10;
        return aLast == bLast || aLast == cLast || bLast == cLast;
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }

}

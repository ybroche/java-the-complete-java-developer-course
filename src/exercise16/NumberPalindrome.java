package exercise16;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707)); // true
        System.out.println(isPalindrome(11212)); // false
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return original == reverse;
    }
}

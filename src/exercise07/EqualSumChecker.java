package exercise07;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1)); // false
        System.out.println(hasEqualSum(1, 1, 2)); // true
        System.out.println(hasEqualSum(1, -1, 0)); // true
    }

    public static boolean hasEqualSum(int first, int second, int third) {
        return first + second == third;
    }
}

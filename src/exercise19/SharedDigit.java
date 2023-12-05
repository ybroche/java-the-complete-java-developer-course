package exercise19;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99)); // false
        System.out.println(hasSharedDigit(15, 55)); // true
    }

    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) return false;
        int firstLastDigit = first % 10;
        int secondLastDigit = second % 10;
        int firstFirstDigit = first / 10;
        int secondFirstDigit = second / 10;
        return firstLastDigit == secondLastDigit || firstLastDigit == secondFirstDigit
                || firstFirstDigit == secondLastDigit || firstFirstDigit == secondFirstDigit;
    }
}

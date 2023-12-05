package exercise24;

public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) System.out.println("Invalid Value");
        else {
            int reversedNumber = reverse(number);
            int originalNumberDigits = getDigitCount(number);
            int reversedNumberDigits = getDigitCount(reversedNumber);
            int leadingZeros = originalNumberDigits - reversedNumberDigits;
            while (reversedNumber != 0) {
                int lastDigit = reversedNumber % 10;
                switch (lastDigit) {
                    case 0:
                        System.out.print("Zero ");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                reversedNumber /= 10;
            }
            while (leadingZeros > 0) {
                System.out.print("Zero ");
                leadingZeros--;
            }
            System.out.println(number == 0 ? "Zero" : "");
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) return -1;
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);
        return count;
    }
}

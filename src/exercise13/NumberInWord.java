package exercise13;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(0); // ZERO
        printNumberInWord(1); // ONE
        printNumberInWord(2); // TWO
        printNumberInWord(3); // THREE
        printNumberInWord(4); // FOUR
        printNumberInWord(5); // FIVE
        printNumberInWord(6); // SIX
        printNumberInWord(7); // SEVEN
        printNumberInWord(8); // EIGHT
        printNumberInWord(9); // NINE
        printNumberInWord(10); // OTHER
    }

    public static void printNumberInWord(int number) {
        switch (number) {
            case 0: System.out.println("ZERO"); break;
            case 1: System.out.println("ONE"); break;
            case 2: System.out.println("TWO"); break;
            case 3: System.out.println("THREE"); break;
            case 4: System.out.println("FOUR"); break;
            case 5: System.out.println("FIVE"); break;
            case 6: System.out.println("SIX"); break;
            case 7: System.out.println("SEVEN"); break;
            case 8: System.out.println("EIGHT"); break;
            case 9: System.out.println("NINE"); break;
            default: System.out.println("OTHER");
        }
    }
}

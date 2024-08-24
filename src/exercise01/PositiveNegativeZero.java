package exercise01;

public class PositiveNegativeZero {
    public static void main(String[] args) {
      checkNumber(1);
      checkNumber(-1);
      checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
package exercise09;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0)); // 78.53975
        System.out.println(area(-1)); // -1
        System.out.println(area(5.0, 4.0)); // 20.0
        System.out.println(area(-1.0, 4.0)); // -1
    }

    public static double area(double radius) {
        if (radius < 0) return -1;
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) return -1;
        return x * y;
    }
}

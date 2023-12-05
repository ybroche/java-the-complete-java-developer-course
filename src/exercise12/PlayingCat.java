package exercise12;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10)); // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) return temperature >= 25 && temperature <= 45;
        return temperature >= 25 && temperature <= 35;
    }
}

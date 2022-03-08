import java.util.*;

public class MathDemo {
    public static void main(String[] args) {
        // Can use a seed in Random() to get the same values
        Random r = new Random(1);

        // Generates 0 <= x < 10
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));

        // Generates 0.0 <= x < 1.0
        System.out.println(r.nextDouble());

        //It does what you expect absolute to do...
        System.out.println(Math.abs(-4));
        System.out.println(Math.abs(4));

        System.out.println(Math.min(2, 3));
        System.out.println(Math.max(2, 3));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.round(1.3));
        System.out.println(Math.round(1.7));
    }
}

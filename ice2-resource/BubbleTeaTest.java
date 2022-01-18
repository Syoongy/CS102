public class BubbleTeaTest {

    public static void displayHasPearlsTest(BubbleTea cup) {
        if (cup.hasPearls()) {
            System.out.printf("%s has pearls in it\n", cup.getBrand());
        } else {
            System.out.printf("%s has no pearls in it\n", cup.getBrand());
        }
    }

    public static void displaySweetnessTest(BubbleTea cup) {
        if (cup.isTooSweet()) {
            System.out.printf("%s is too sweet\n", cup.getBrand());
        } else {
            System.out.printf("%s is low in sugar\n", cup.getBrand());
        }

    }

    public static void displaySweetnessComparison(BubbleTea cup1, BubbleTea cup2) {

        if (cup1.isSweeterThan(cup2)) {
            System.out.printf("%s is sweeter than %s\n", cup1.getBrand(), cup2.getBrand());
        } else {
            System.out.printf("%s is sweeter than %s\n", cup2.getBrand(), cup1.getBrand());
        }
    }

    public static void main(String[] args) {
        // CLASSPATH
        // (A) Declare the 3 cups of bubble tea
        BubbleTea cup1 = new BubbleTea("Kong Cha", 100, true);
        BubbleTea cup2 = new BubbleTea("COIL", 80, true);
        BubbleTea cup3 = new BubbleTea("Ho Lai Ho Kee", 50, false);

        System.out.println("1. Pearl Test");
        displayHasPearlsTest(cup1);
        displayHasPearlsTest(cup2);
        displayHasPearlsTest(cup3);
        System.out.println();

        System.out.println("2. Sweetness Test");
        displaySweetnessTest(cup1);
        displaySweetnessTest(cup2);
        displaySweetnessTest(cup3);
        System.out.println();

        System.out.println("3. Sweetness Comparison Test");
        displaySweetnessComparison(cup1, cup2);
        displaySweetnessComparison(cup1, cup3);
        displaySweetnessComparison(cup2, cup3);
        System.out.println();

        cup3.increaseSugarLevel(70);
        System.out.println("3. Sweetness Comparison Test after increase in cup3 sugar level");
        displaySweetnessComparison(cup1, cup2);
        displaySweetnessComparison(cup1, cup3);
        displaySweetnessComparison(cup2, cup3);
        System.out.println();

    }
}

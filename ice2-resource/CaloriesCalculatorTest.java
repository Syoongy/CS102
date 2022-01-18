public class CaloriesCalculatorTest {
    public static void main(String[] args) {
        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);

        System.out.printf("%s is more sinful than %s: %b\n", tart.getName(), bakKwa.getName(),
                tart.isMoreSinful(bakKwa));
        System.out.println();

        System.out.printf("%s (calories per gram) :%.2f\n", tart.getName(), tart.getCaloriesPerGram());
        System.out.printf("%s (calories per gram) :%.2f\n", bakKwa.getName(), bakKwa.getCaloriesPerGram());
        System.out.printf("%s (calories per gram) :%.2f\n", loveLetters.getName(), loveLetters.getCaloriesPerGram());
        System.out.println();

        CaloriesCalculator calculator = new CaloriesCalculator();
        calculator.addNewYearGoodie(tart, 2);
        calculator.addNewYearGoodie(bakKwa, 3);
        calculator.addNewYearGoodie(loveLetters, 5);
        System.out.printf("Total Calories :%.2f\n", calculator.getTotalCalories());

        System.out.printf("Most sinful goodie :%s\n", calculator.getMostSinfulGoodie().getName());

    }
}

public class Q1 {

    public static int sumOfDigits(int number) {
        int result = 0;
        // if (number < 0) {
        // number = -number;
        // }
        number = Math.abs(number);
        while (number != 0) {
            result += number % 10;
            number /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}

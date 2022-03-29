public class Adder {
    public static void main(String[] args) {
        String displayStr = "";
        int sum = 0;

        for (String val : args) {
            try {
                sum += Integer.parseInt(val);
                displayStr += val + " + ";
            } catch (NumberFormatException e) {
                // TODO: handle exception
            }
        }

        if (displayStr.length() > 3) {
            displayStr = displayStr.substring(0, displayStr.length() - 2) + "= " + sum;
        }

        System.out.println(displayStr);
    }
}

import java.util.Scanner;
import java.io.*;

public class InventoryApp {

    public static void stockTaking(String fileNameAndPath) {
        int totalVal = 0;
        double totalPrice = 0;

        try (Scanner csvScanner = new Scanner(new File(fileNameAndPath))) {

            csvScanner.useDelimiter(",|\r\n|\n");
            while (csvScanner.hasNext()) {
                int tmpProductCount = csvScanner.nextInt();
                String productName = csvScanner.next();
                double tmpProductPrice = csvScanner.nextDouble();
                totalVal += tmpProductCount;
                totalPrice += tmpProductPrice * tmpProductCount;
                System.out.printf("There are %d %s, each cost $%.2f%n", tmpProductCount, productName, tmpProductPrice);
            }

            System.out.printf("There are %d products with a total value of $%.2f to be sold.%n", totalVal, totalPrice);

        } catch (FileNotFoundException e) {
            // Method does nothing if the filename is invalid
        }
    }

    public static void main(String[] args) {
        stockTaking("product.csv");
    }
}

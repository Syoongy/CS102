import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name : ");
     
        String name = sc.nextLine();

        System.out.print("Enter product code : ");
        String productCode = sc.nextLine();
        
        System.out.print("Enter product price : ");
        double price = sc.nextDouble();
        
        Product.validate(productCode);   

        Product p = new Product(name, productCode, price);
        System.out.println("The discounted price is " + p.getDiscountedPrice());

        System.out.println();
    
    }
}

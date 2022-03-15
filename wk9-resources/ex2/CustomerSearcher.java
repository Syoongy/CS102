import java.util.*;
public class CustomerSearcher{
	
	//  Implement missing methods here
	

	// ********************************

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer c1 = new Customer("andy",10,2005,2000);
		Customer c2 = new Customer("bob",12,2005,1000);
		Customer c3 = new Customer("ruth",10,1987,1900);
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		
		System.out.println("\r\nThe customer who purchased the most items is: ");
		System.out.println(CustomerSearcher.findPurchasedTheMostItems(customers));
		
		System.out.println("\r\nThe oldest customer is: ");
		System.out.println(CustomerSearcher.findOldest(customers));
		
		System.out.println("\r\nThe customer who spent the most dollars is: ");
		System.out.println(CustomerSearcher.findSpentTheMostDollars(customers));
		
		System.out.println("\r\nDeleting \"Ruth\" ...");
		CustomerSearcher.removeFirstCustomerWithName(customers,"ruth");
		
		System.out.println("The remaining customers (after the deletion) are:");
		for(Customer c:customers) {
			System.out.println(c);
		}
	}
}
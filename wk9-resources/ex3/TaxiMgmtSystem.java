import java.util.*;

public class TaxiMgmtSystem{
	private ArrayList<Taxi> taxis;
	public TaxiMgmtSystem(ArrayList<Taxi> taxiFleet) {
		this.taxis = taxiFleet;
	}
	
	// Implement missing methods here
	

	// *********************************************
	
	public static void main(String[] args) {
		ArrayList<Taxi> taxis = new ArrayList<Taxi>();
		
		// Create Taxi 1
		ArrayList<Double> earnings1 = new ArrayList<Double>();
		earnings1.add(500.0);
		earnings1.add(550.0);
		earnings1.add(250.0);
		ArrayList<Integer> trips1 = new ArrayList<Integer>();
		trips1.add(20);
		trips1.add(25);
		trips1.add(23);
		Taxi t1 = new Taxi ("S123",2003,earnings1,trips1);
		
		//Create Taxi 2
		ArrayList<Double> earnings2 = new ArrayList<Double>();
		earnings2.add(700.0);
		earnings2.add(550.0);
		earnings2.add(250.0);
		ArrayList<Integer> trips2 = new ArrayList<Integer>();
		trips2.add(20);
		trips2.add(25);
		trips2.add(20);
		Taxi t2 = new Taxi ("S124",2003,earnings2,trips2);

		//Create Taxi 3
		ArrayList<Double> earnings3 = new ArrayList<Double>();
		earnings3.add(800.0);
		earnings3.add(550.0);
		earnings3.add(250.0);
		ArrayList<Integer> trips3 = new ArrayList<Integer>();
		trips3.add(20);
		trips3.add(25);
		trips3.add(20);
		Taxi t3 = new Taxi ("S125",2005,earnings3,trips3);
		
		taxis.add(t1);
		taxis.add(t2);
		taxis.add(t3);

		System.out.println("All taxis in the system:");
		System.out.println("-------------------------\r\n");
		for (Taxi taxi:taxis) {
			System.out.println(taxi + "\r\n");
		}
		System.out.println("-------------------------");
		
		TaxiMgmtSystem tms = new TaxiMgmtSystem(taxis);
		System.out.println("The top earner is: ");
		System.out.println(tms.findTopEarner());
		System.out.println("-------------------------");
		System.out.println("The taxi with the most trips is: ");
		System.out.println(tms.findTaxiWithTheMostTrips());
		System.out.println("-------------------------");
		System.out.println("The bottom earner is: ");
		System.out.println(tms.findBottomEarner());
		System.out.println("-------------------------");
		System.out.println("The top earner with vehicle purchased at 2003 is: ");
		System.out.println(tms.findTopEarnerWithVehiclePurchasedAt(2003));
		System.out.println("-------------------------");
	}
}
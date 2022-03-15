public class Customer{
	String name;
	int itemsPurchased;
	int yearJoined;
	double dollarsSpent;
	
	public Customer(String name, int itemsPurchased, int yearJoined, double dollarsSpent) {
		this.name = name;
		this.itemsPurchased = itemsPurchased;
		this.yearJoined = yearJoined;
		this.dollarsSpent = dollarsSpent;
	}
	
	public String toString() {
		return name + "," + itemsPurchased + "," + yearJoined + "," + dollarsSpent;
	}
	
	public int getYearJoined() {
		return yearJoined;
	}
	
	public void setYearJoined(int yearJoined) {
		this.yearJoined = yearJoined;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () 
	{
		return name;
	}
	
	public void setItemsPurchased (int itemsPurchased) {
		this.itemsPurchased = itemsPurchased;
	}
	
	public int getItemsPurchased () {
		return itemsPurchased;
	}
	
	public void setDollarsSpent (double dollarsSpent) {
		this.dollarsSpent = dollarsSpent;
	}
	
	public double getDollarsSpent () {
		return dollarsSpent;
	}
}
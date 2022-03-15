import java.util.*;
public class Taxi {
	private String id;
	private ArrayList<Double> dailyEarningsList; // Each entry in the list contains money made at a particular day
	private ArrayList<Integer> dailyTripCountList; //  Each entry in the list contains the number of trips made at a particular day
	private int vehiclePurchaseYear;
	
	public Taxi(String id, int vehiclePurchaseYear, ArrayList<Double> dailyEarningsList, ArrayList<Integer> dailyTripCountList) {
		this.id = id;
		this.dailyEarningsList = dailyEarningsList;
		this.dailyTripCountList = dailyTripCountList;
		this.vehiclePurchaseYear = vehiclePurchaseYear;
	}

	public String getId() {
		return id;
	}
	
	public ArrayList<Double> getEarnings() {
		return dailyEarningsList;
	}
	
	public ArrayList<Integer> getTrips()
	{
		return dailyTripCountList;
	}	
	
	public int getYearPurchased() {
		return vehiclePurchaseYear;
	}
	
	public String toString() {
		String sInfo = "ID: " + id + "\r\n";
		sInfo += "Earnings: ";
		for (int i=0;i<dailyEarningsList.size();i++) {
			sInfo += dailyEarningsList.get(i);
		    if (i != dailyEarningsList.size()-1) sInfo+=",";
		}
		sInfo += "\r\nTrips: ";
		for (int i=0;i<dailyTripCountList.size();i++) {
			sInfo += dailyTripCountList.get(i);
		    if (i != dailyTripCountList.size()-1) sInfo+=",";
		}
		return sInfo;
	}
}
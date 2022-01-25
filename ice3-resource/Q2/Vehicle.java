public class Vehicle {
    private int numWheels;
    private double distancePerLiter;

    public Vehicle(int numWheels, double distancePerliter) {
        this.numWheels = numWheels;
        this.distancePerLiter = distancePerliter;
    }

    @Override
    public String toString() {
        return "Vehicle [numWheels=" + numWheels + ", distancePerLiter=" + distancePerLiter + "]";
    }

}

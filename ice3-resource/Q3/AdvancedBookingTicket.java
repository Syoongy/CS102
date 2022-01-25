public class AdvancedBookingTicket extends Ticket {
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }

    @Override
    public double calculatePrice() {
        double origPrice = super.calculatePrice();
        double discount = 0.0;
        int tmpDaysInAdvance = this.numDaysInAdvance;

        while (discount <= (origPrice / 2.0) && tmpDaysInAdvance > 0) {
            discount += 0.5;
            tmpDaysInAdvance--;
        }

        if (tmpDaysInAdvance > 0) {
            discount = origPrice / 2.0;
        }

        return origPrice - discount;
    }
}

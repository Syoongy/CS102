import java.util.ArrayList;

public class TicketUtility {
    public static double calculateAverageTicketPrice(ArrayList<Ticket> ticketList) {
        double totalPrice = 0.0;

        if (ticketList != null) {
            if (ticketList.size() > 0) {
                for (int i = 0; i < ticketList.size(); i++) {
                    totalPrice += ticketList.get(i).calculatePrice();
                }
                totalPrice = totalPrice / ticketList.size();
            }
        }

        return totalPrice;
    }
}

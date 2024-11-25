package cli;

public class Customer {
    private String customerName;
    private TicketPool ticketPool;
    private int ticketBuyingRate;

    public Customer(String customerName, TicketPool ticketPool, int ticketBuyingRate) {
        this.customerName = customerName;
        this.ticketPool = ticketPool;
        this.ticketBuyingRate = ticketBuyingRate;
    }

}

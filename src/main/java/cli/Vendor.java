package cli;

public class Vendor {
    private String vendorName;
    private TicketPool ticketPool;
    private int ticketRealseRate;

    public Vendor(String vendorName, TicketPool ticketPool, int ticketRealseRate) {
        this.vendorName = vendorName;
        this.ticketPool = ticketPool;
        this.ticketRealseRate = ticketRealseRate;
    }


}

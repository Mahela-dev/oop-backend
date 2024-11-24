package cli;

public class TicketConfig {
    private int totalTickets;
    private int ticketReleaseRate;
    private int customerRetrievalRate;
    private int maxTicketsCapacity;

    public TicketConfig(int totalTickets, int ticketReleaseRate, int customerRetrievalRate,int maxTicketsCapacity) {
        this.totalTickets = totalTickets;
        this.ticketReleaseRate = ticketReleaseRate;
        this.customerRetrievalRate = customerRetrievalRate;
        this.maxTicketsCapacity = maxTicketsCapacity;
    }

    public int getTotalTickets() {
        return totalTickets;
    }
    public int getTicketReleaseRate() {
        return ticketReleaseRate;
    }
    public int getCustomerRetrievalRate() {
        return customerRetrievalRate;
    }
    public int getMaxTicketsCapacity() {
        return maxTicketsCapacity;
    }
    public void setTotalTickets(int totalTickets) {
        if (totalTickets < 0 || totalTickets > 1000) {
            System.out.println("Invalid total ticket number");
        }else {
            this.totalTickets = totalTickets;
            System.out.println("Total ticket number: " + totalTickets);
        }
    }
    public void setTicketReleaseRate(int ticketReleaseRate) {
        this.ticketReleaseRate = ticketReleaseRate;
    }
    public void setCustomerRetrievalRate(int customerRetrievalRate) {
        this.customerRetrievalRate = customerRetrievalRate;
    }
    public void setMaxTicketsCapacity(int maxTicketsCapacity) {
        this.maxTicketsCapacity = maxTicketsCapacity;
    }

}

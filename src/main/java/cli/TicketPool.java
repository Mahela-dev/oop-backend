package cli;

import java.util.List;

public class TicketPool {
  private TicketConfig ticketConfig;
  private int releaseTicketCount;
  private int buyTicketCount;
  private final List<String> tickets;

    public TicketPool(TicketConfig ticketConfig, int buyTicketCount, int releaseTicketCount, List<String> tickets) {
        this.ticketConfig = ticketConfig;
        this.tickets = tickets;
        this.buyTicketCount = 0;
        this.releaseTicketCount = 0;
    }

    public TicketConfig getTicketConfig() {
        return ticketConfig;
    }

    public void setTicketConfig(TicketConfig ticketConfig) {
        this.ticketConfig = ticketConfig;
    }

    public int getReleaseTicketCount() {
        return releaseTicketCount;
    }

    public void setReleaseTicketCount(int releaseTicketCount) {
        this.releaseTicketCount = releaseTicketCount;
    }

    public int getBuyTicketCount() {
        return buyTicketCount;
    }

    public void setBuyTicketCount(int buyTicketCount) {
        this.buyTicketCount = buyTicketCount;
    }

    public String addTicket(String vendor,int ticket) {



        if (ticket > ticketConfig.getTotalTickets()){
            return "Ticket contity exceeds the maximum number of tickets";
        }

        for (int i = 0; i < ticketConfig.getTotalTickets(); i++) {
            int ticketCount = this.tickets.size();

            if (ticketCount > ticketConfig.getTotalTickets()){
                String ticketData ="ticket number : "+tickets.size()+1 +"by vendor : "+vendor;
                tickets.add(ticketData);
            }else {
                return "Released ticket reached the maximum number of tickets";
            }
        }
        return ticket +"Ticket added to the pool by : "+vendor;
    }
    public void buyTicket(int ticket) {
    }
}

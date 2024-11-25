package cli;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
        if (totalTickets < 0 ) {
            System.out.println("Invalid  ticket Release Rate");
        } else if (ticketReleaseRate > totalTickets ) {
            System.out.println("Invalid ticket release rate(Release rate can not exceed the total ticket)");
        } else {
        this.ticketReleaseRate = ticketReleaseRate;
            System.out.println("Ticket Release Rate set to : " + totalTickets);
        }
    }
    public void setCustomerRetrievalRate(int customerRetrievalRate) {
        if (totalTickets < 0 ) {
            System.out.println("Invalid Retrieval Rate");
        } else if (customerRetrievalRate > totalTickets ) {
            System.out.println("Rate can not exceed the total ticket");
        } else {
        this.customerRetrievalRate = customerRetrievalRate;
            System.out.println("Customer ticket retrieval rate set to : " + totalTickets);
        }

    }
    public void setMaxTicketsCapacity(int maxTicketsCapacity) {
        if (totalTickets < 0) {
            System.out.println("Invalid max Tickets Capacity");
        } else if (maxTicketsCapacity > totalTickets ) {
            System.out.println("Max Tickets Capacity can not exceed the total ticket");
        } else {
        this.maxTicketsCapacity = maxTicketsCapacity;
            System.out.println("Set max ticket capacity to : " + totalTickets);
        }
    }

public void saveToFile(String filename) {
    Gson gson = new Gson();
    try (FileWriter fileWriter = new FileWriter(filename);){
        gson.toJson(this, fileWriter);

    } catch (IOException e) {
        e.printStackTrace();
    }
}

public static TicketConfig loadFromFile(String filename) {
    Gson gson = new Gson();
    try (FileReader fileReader = new FileReader(filename);){
        return gson.fromJson(fileReader, TicketConfig.class);
    }catch (IOException e) {
        System.out.println("Error while Reading from file");
    }
    return null;
}



}

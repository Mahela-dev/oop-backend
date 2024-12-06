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
            this.totalTickets = totalTickets;
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

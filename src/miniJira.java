import java.time.LocalDateTime;
import java.util.*;

public class miniJira {
    public static void main(String[] args) {

        List<Ticket> ticketList = new LinkedList<>();
        ticketList.add(new Ticket(0, "check payments one more time", LocalDateTime.now()));
        ticketList.add(new Ticket(3, "NO PAYMENTS URGENT", LocalDateTime.now()));
        ticketList.add(new Ticket(3, "NO PAYMENTS URGENT", LocalDateTime.now()));
        ticketList.add(new Ticket(0, "check payments one more time", LocalDateTime.now()));
        ticketList.add(new Ticket(0, "check payments one more time", LocalDateTime.of(2021, 10, 2, 17, 55)));
        ticketList.add(new Ticket(2, "HELP ASAP", LocalDateTime.now()));
        ticketList.add(new Ticket(0, "check payments one more time", LocalDateTime.now()));
        ticketList.add(new Ticket(0, "check payments one more time", LocalDateTime.now()));
        ticketList.add(new Ticket(1, "check DB", LocalDateTime.now()));
        ticketList.add(new Ticket(0, "check payments one more time", LocalDateTime.now()));
        ticketList.add(new Ticket(0, "check payments one more time", LocalDateTime.now()));
        ticketList.add(new Ticket(0, "check payments one more time", LocalDateTime.of(2021, 10, 2, 19, 30)));
        //sorting by priority -> creationDateTime
        ticketList.sort(new TicketComparator().reversed());

        Queue<Ticket> ticketQueue = new ArrayDeque<>(ticketList);

        Worker worker = new Worker(ticketQueue);
        worker.doAllWork();
    }
}
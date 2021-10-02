import java.util.Comparator;

public class TicketComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        int i = o1.getPriority() - o2.getPriority();
        if (i != 0) return i;
        return o2.getCreationDate().compareTo(o1.getCreationDate());
    }
}

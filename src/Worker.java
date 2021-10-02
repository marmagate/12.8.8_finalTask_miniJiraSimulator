import java.util.Queue;

public class Worker {

    private Queue<Ticket> toDoQueue;

    public Worker(Queue<Ticket> toDoQueue) {
        this.toDoQueue = toDoQueue;
    }

    public void doAllWork() {
        while (toDoQueue.peek() != null) {
            takeTask();
        }
        System.out.println("Let's drink coffee");
    }

    private void takeTask() {
        Ticket ticket = toDoQueue.poll();
        if (ticket != null) {
            System.out.println("Working at " + ticket);
        }
    }
}
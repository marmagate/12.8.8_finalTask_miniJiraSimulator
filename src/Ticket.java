import java.time.LocalDateTime;

public class Ticket {

    private final int priority; // 0 - minor; 1 - major; 2 - critical; 3 - blocker;
    private final String description;
    private final LocalDateTime creationDate;

    public Ticket(int priority, String description, LocalDateTime creationDate) {
        if (priority < 0 || priority > 3 || description == null || creationDate == null) {
            throw new IllegalArgumentException();
        }
        this.priority = priority;
        this.description = description;
        this.creationDate = creationDate;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "priority=" + priority +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
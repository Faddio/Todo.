package lexicon;
import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String title;
    private String description;
    private LocalDate deadline;
    private boolean done;
    private String creator;

    public TodoItem (int id, String title, String description, LocalDate deadline, boolean done, String creator) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.done = done;
        this.creator = creator;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public boolean isOverdue() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.isAfter(deadline);
    }

    public String getSummary() {
        return "Todo Item ID: " + id + "\nTitle: " + title + "\nDescription: " + description + "\nDeadline: " + deadline + "\nDone: " + done + "\nCreator: " + creator;
    }
}

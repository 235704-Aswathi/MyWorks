package in.stackroute.ust.domain;

public class Todo {

    private int id;

    private String reminder;

    private boolean completed;

    public Todo() {
    }

    public Todo(int id, String reminder, boolean completed) {
        this.id = id;
        this.reminder = reminder;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReminder() {
        return reminder;
    }

    public void setReminder(String reminder) {
        this.reminder = reminder;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}

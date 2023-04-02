package OOP.DZ4;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class Task implements Printable {
    private UUID id;
    private String description;
    private Enum priority;
    private Employee author;
    private Date creation;
    private Date start;
    private Date deadline;


    public Task(String description, Enum priority, Employee author, Date start, Date deadline) {
        this.id = UUID.randomUUID();
        this.description = description;
        this.priority = priority;
        this.author = author;
        this.creation = new Date();
        start.setYear(start.getYear()-1900);
        this.start = start;
        deadline.setYear(deadline.getYear()-1900);
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Enum getPriority() {
        return priority;
    }

    public void setPriority(Enum priority) {
        this.priority = priority;
    }

    public Employee getAuthor() {
        return author;
    }

    public void setAuthor(Employee author) {
        this.author = author;
    }

    public UUID getId() {
        return id;
    }

    public Date getCreation() {
        return creation;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "id задачи: " + this.id + "\n"
                + "Описание задачи: " + this.description + "\n"
                + "Приоритет: " +this.priority + "\n"
                + "Автор: " + this.author + "\n"
                + "Дата создания: " + this.creation+ "\n"
                + "Дата начала: " + this.start + "\n"
                + "Дедлайн: " + this.deadline + "\n"
                + "_______________________________________";
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(description, task.description) && Objects.equals(priority, task.priority) && Objects.equals(author, task.author) && Objects.equals(creation, task.creation) && Objects.equals(start, task.start) && Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, priority, author, creation, start, deadline);
    }
}
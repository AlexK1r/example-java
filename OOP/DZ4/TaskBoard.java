package OOP.DZ4;

import java.util.ArrayList;

public class TaskBoard implements Printable{
    private ArrayList<Task> taskBoard = new ArrayList<>();

    public TaskBoard() {
    }

    public void addToTaskBoard(Task task) {
        this.taskBoard.add(task);
    }

    public ArrayList<Task> getTaskBoard() {
        return taskBoard;
    }

    public void setTaskBoard(ArrayList<Task> taskBoard) {
        this.taskBoard = taskBoard;
    }

    @Override
    public void print() {
        for (Task task : this.taskBoard) {
            System.out.println(task);
        }
    }
}

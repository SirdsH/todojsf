package cz.educanet;

public class TodoTask {
    private String task;
    private boolean finished;

    public TodoTask(String task) {
        this.task = task;
        this.finished = false;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}

package cz.educanet;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("Todo")
@SessionScoped
public class Todo implements Serializable {

    private TodoService todoService = new TodoService();
    private String task;

    public void addTask() {
        todoService.addTask(task);
    }

    public void removeTask(TodoTask task) {
        todoService.removeTask(task);
    }

    public List<TodoTask> getTodoList() {
        return todoService.getTodoList();
    }

    public List<TodoTask> finished() {
       return todoService.finished();
    }

    public List<TodoTask> active() {
        return todoService.active();
    }

    public void finish(TodoTask task) {
        task.setFinished(true);
    }
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
}

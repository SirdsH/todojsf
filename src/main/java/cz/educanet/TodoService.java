package cz.educanet;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    private List<TodoTask> todoList = new ArrayList<>();

    public List<TodoTask> getTodoList() {
        return todoList;
    }

    public void addTask(String task) {
        this.todoList.add(new TodoTask(task));
    }

    public void removeTask(TodoTask task) {
        this.todoList.remove(task);
    }

    public List<TodoTask> finished() {
        return this.todoList.stream().filter(i -> i.isFinished()).toList();
    }

    public List<TodoTask> active() {
        return this.todoList.stream().filter(i -> !i.isFinished()).toList();
    }

}

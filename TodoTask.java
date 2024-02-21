package com.mycompany.pratice;

public class TodoTask {
    public String description;
    public boolean completed;

    public TodoTask(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "TodoTask{" + "description=" + description + ", completed=" + completed + '}';
    }
}

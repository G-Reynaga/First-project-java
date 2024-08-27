package com.tareas.gestor;

public class Tarea {
    private final String name;
    private final String description;
    private boolean complete;

    public Tarea(String name, String description){
        this.name = name;
        this.description = description;
        this.complete = false;
    }

    public void markCompleted() {
        this.complete = true;
    }

    @Override
    public String toString(){
        return name + " - " + description + " [" + (complete ? "Complete" : "Pending") + "]";
    }
}

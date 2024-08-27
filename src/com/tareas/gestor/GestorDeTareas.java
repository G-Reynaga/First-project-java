package com.tareas.gestor;

import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas {
    private final List<Tarea> tareas;

    public GestorDeTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String name, String description) {
        Tarea nuevaTarea = new Tarea(name, description);
        tareas.add(nuevaTarea);
    }

    public void listarTareas() {
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }

    public void marcarTareaComoCompletadas(int indice) {
        if (indice > 0 && indice <= tareas.size()) {
            tareas.get(indice - 1).markCompleted();
        } else {
            System.out.println("Indice fuera de rango");
        }
    }

    public void eliminarTarea(int indice) {
        if (indice > 0 && indice <= tareas.size()) {
            tareas.remove(indice - 1);
        } else {
            System.out.println("Indice fuera de rango");
        }
    }
}

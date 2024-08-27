import com.tareas.gestor.GestorDeTareas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas gestor = new GestorDeTareas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Listar Tarea");
            System.out.println("3. Marcar Tarea como completada");
            System.out.println("4. Eliminar Tarea");
            System.out.println("5. Salir");
            System.out.println("Elige una opción");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Nombre de la tarea: ");
                    String name = scanner.nextLine();
                    System.out.println("Descripción: ");
                    String description = scanner.nextLine();
                    gestor.agregarTarea(name, description);
                    break;
                case 2:
                    gestor.listarTareas();
                    break;
                case 3:
                    System.out.println("Marcar número como tarea completada: ");
                    int indiceCompletada = scanner.nextInt();
                    gestor.marcarTareaComoCompletadas(indiceCompletada);
                    break;
                case 4:
                    System.out.println("Número de tarea a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    gestor.eliminarTarea(indiceEliminar);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }
}
package org.odc.todolist.view;

import java.util.Scanner;

import org.odc.todolist.controller.TodoController;
import org.odc.todolist.controller.TodoControllerImpl;
import org.odc.todolist.dto.TodoDto;
import org.odc.todolist.model.entity.Todo;
import org.odc.todolist.model.enums.Priority;

public class TodoView {
    private final Scanner sc = new Scanner(System.in);
    private final TodoController controller = new TodoControllerImpl();

    public void createNewTask(){
        System.out.println("Creation d'une nouvelle tache");
        
        TodoDto todoDto = create();
        controller.add(todoDto);
    }

    public void updateTask(){
        System.out.println("Modification d'une tache");
        show();
        System.out.println("Selectionnez la tache que vous voulez modifier");

        int choix = sc.nextInt();
        sc.nextLine();
        
        TodoDto todoDto = create();
        
        controller.update(choix - 1, todoDto);
    }

    public void show(){
        if (controller.findAll().isEmpty()) {
            System.out.println("Vous n'avez aucune tache");
            return;
        }

        System.out.println("*** Liste des taches");

        int i = 1;
        for(var todo: controller.findAll()){
            System.out.println(i + " - " + todo.getName() + " -> " + todo.getStatus());
            System.out.println("__________________________________________");
        }
    }


    private TodoDto create(){
        System.out.print("Nom: ");
        String nom = sc.nextLine();
        
        System.out.print("Priorité: 1- Faible, 2- Moyen, 3- Haute: ");
        int priorite = sc.nextInt();
        sc.nextLine();

        System.out.print("Description: ");
        String description = sc.nextLine();

        Priority priority = switch(priorite){
            case 2 -> Priority.MOYEN;
            case 3 -> Priority.HAUTE;
            default -> Priority.FAIBLE;
        };

        return new TodoDto(nom, priority, description);
    }

}

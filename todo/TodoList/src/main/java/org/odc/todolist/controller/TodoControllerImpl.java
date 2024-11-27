package org.odc.todolist.controller;

import org.odc.todolist.dto.TodoDto;
import org.odc.todolist.model.entity.Todo;
import org.odc.todolist.model.enums.TodoStatus;

import java.util.ArrayList;
import java.util.List;

public class TodoControllerImpl implements TodoController {
    private final List<Todo> todos = new ArrayList<>();

    @Override
    public void add(TodoDto dto) {
        if (dto == null || dto.getName() == null || dto.getName().isEmpty()) {
            throw new RuntimeException("Une tache doit obligatoirement avoir un nom");
        }

        Todo todo = new Todo(
            dto.getName(),
            dto.getPriority(),
            dto.getDescription()
        );

        todos.add(todo);
        System.out.println("Ajout de la tache effectué avec succès");

        System.out.println(todo);

        System.out.println("______________________________________________");
    }

    @Override
    public void update(int id, TodoDto dto) {
        Todo todo = findById(id);

        for(var task: todos){
            
            if (task.getId() == todo.getId()) {   
                task.setName(dto.getName());
                task.setPriority(dto.getPriority());
                task.setDescription(dto.getDescription());

                break;
            }
        }

        System.out.println("Tache Modifiée avec succès");
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Todo findById(int index) {
        System.out.println();

        Todo todo = todos.get(index);

        if (todo == null) {
            throw new RuntimeException("Cette tache n'existe pas");
        }

        return todo;
    }

    @Override
    public void changeStatus(int id, TodoStatus status) {

    }

    @Override
    public List<Todo> findAll() {
        return todos;
    }
}

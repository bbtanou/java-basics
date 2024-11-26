package org.odc.todolist.controller;

import org.odc.todolist.model.entity.Todo;
import org.odc.todolist.model.enums.Priority;
import org.odc.todolist.model.enums.TodoStatus;

import java.util.ArrayList;
import java.util.List;

public class TodoControllerImpl implements TodoController {
    private final List<Todo> todos = new ArrayList<>();

    @Override
    public void add(String nom, Priority priority, String description) {

    }

    @Override
    public void update(int id, String nom, Priority priority, String description) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Todo findById(int id) {
        return null;
    }

    @Override
    public void changeStatus(int id, TodoStatus status) {

    }

    @Override
    public List<Todo> findAll() {
        return List.of();
    }
}

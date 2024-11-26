package org.odc.todolist.controller;

import org.odc.todolist.model.entity.Todo;
import org.odc.todolist.model.enums.Priority;
import org.odc.todolist.model.enums.TodoStatus;

import java.util.List;

public interface TodoController {
    void add(String nom, Priority priority, String description);
    void update(int id, String nom, Priority priority, String description);
    void delete(int id);
    Todo findById(int id);

    void changeStatus(int id, TodoStatus status);

    List<Todo> findAll();
}

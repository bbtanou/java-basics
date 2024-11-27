package org.odc.todolist.controller;

import org.odc.todolist.dto.TodoDto;
import org.odc.todolist.model.entity.Todo;
import org.odc.todolist.model.enums.TodoStatus;

import java.util.List;

public interface TodoController {
    void add(TodoDto dto);
    void update(int id, TodoDto dto);
    void delete(int id);
    Todo findById(int id);

    void changeStatus(int id, TodoStatus status);

    List<Todo> findAll();
}

package org.odc.todolist.model.entity;

import org.odc.todolist.model.enums.Priority;
import org.odc.todolist.model.enums.TodoStatus;

import java.util.Date;

public class Todo {
    private int id;
    private String name;
    private Priority priority;
    private Date date;
    private String description;
    private TodoStatus status;
}

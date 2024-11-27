package org.odc.todolist.model.entity;

import org.odc.todolist.model.enums.Priority;
import org.odc.todolist.model.enums.TodoStatus;

import lombok.Data;
import java.util.Date;

@Data
public class Todo {
    private long id;
    private String name;
    private Priority priority;
    private Date date;
    private String description;
    private TodoStatus status;

    public Todo(String nom, Priority priority, String description){
        this.id = System.currentTimeMillis();
        this.date = new Date();
        this.status = TodoStatus.EN_ATTENTE;
        
        this.name = nom;
        this.priority = priority;
        this.description = description;
    }
}

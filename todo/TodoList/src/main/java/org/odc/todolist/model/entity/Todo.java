package org.odc.todolist.model.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.odc.todolist.model.enums.Priority;
import org.odc.todolist.model.enums.TodoStatus;

import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "todo")
@NoArgsConstructor
public class Todo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    private Date date;

    private String description;

    @Enumerated(EnumType.STRING)
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

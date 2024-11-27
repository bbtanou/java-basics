package org.odc.todolist.dto;

import org.odc.todolist.model.enums.Priority;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TodoDto {
   private String name;
   private Priority priority;
   private String description; 
}

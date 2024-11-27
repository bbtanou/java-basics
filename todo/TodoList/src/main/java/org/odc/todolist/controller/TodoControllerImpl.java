package org.odc.todolist.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.odc.todolist.db.AppDb;
import org.odc.todolist.dto.TodoDto;
import org.odc.todolist.model.entity.Todo;
import org.odc.todolist.model.enums.TodoStatus;

import java.util.List;

public class TodoControllerImpl implements TodoController {
    private final Session session = AppDb.getSessionFactory().openSession();

    @Override
    public void add(TodoDto dto) {
        if (dto == null || dto.getName() == null || dto.getName().isEmpty()) {
            throw new RuntimeException("Une tache doit obligatoirement avoir un nom");
        }

        Transaction transaction = session.beginTransaction();
        try{
            Todo todo = new Todo(
                    dto.getName(),
                    dto.getPriority(),
                    dto.getDescription()
            );

            session.save(todo);
            transaction.commit();
            System.out.println("Ajout de la tache effectué avec succès");

            System.out.println(todo);

            System.out.println("______________________________________________");
        }catch (Exception e){
            transaction.rollback();
            System.out.println("Impossible d'enregistrer la tache: " + e.getMessage());
        }
    }

    @Override
    public void update(int id, TodoDto dto) {
        Transaction transaction = session.beginTransaction();
        try {
            Todo todo = findById(id);
            todo.setName(dto.getName());
            todo.setPriority(dto.getPriority());
            todo.setDescription(dto.getDescription());

            session.update(todo);
            transaction.commit();

            System.out.println("Tache Modifiée avec succès");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void delete(int id) {
        Transaction transaction = session.beginTransaction();
        try {
            Todo todo =  findById(id);
            session.delete(todo);

            transaction.commit();
            System.out.println("Tache supprimé avec succes");
        }catch (Exception e){
            transaction.rollback();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Todo findById(int id) {
        Todo todo = session.get(Todo.class, id);

        if (todo == null) {
            throw new RuntimeException("Cette tache n'existe pas");
        }

        return todo;
    }

    @Override
    public void changeStatus(int id, TodoStatus status) {
        Transaction transaction = session.beginTransaction();
        try {
            Todo todo = findById(id);
            todo.setStatus(status);
            session.update(todo);

            transaction.commit();
            System.out.println("Statut de la tache a ete changé");
        }catch (Exception e){
            System.out.println(e.getMessage());
            transaction.rollback();
        }
    }

    @Override
    public List<Todo> findAll() {
        return session.createQuery("FROM Todo", Todo.class)
                .getResultList();
    }
}

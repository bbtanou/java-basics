package org.odc.todolist.db;


import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.odc.todolist.model.entity.Todo;

public class AppDb {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null) {
            try {
                sessionFactory = new Configuration()
                        .addAnnotatedClass(Todo.class)
                        .buildSessionFactory();

                System.out.println("Session crée avec success");
                return sessionFactory;
            }catch (Exception e){
                System.out.println("Impossible de creer une session");
                throw new RuntimeException(e.getMessage());
            }
        }

        return sessionFactory;
    }

    public void shutdown(){
        if (sessionFactory != null){
            sessionFactory.close();
        }
    }
}

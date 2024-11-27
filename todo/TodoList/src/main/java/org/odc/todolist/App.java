package org.odc.todolist;

import org.odc.todolist.view.TodoView;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        TodoView view = new TodoView();
        view.createNewTask();
        view.updateTask();
        view.show();
    }
}

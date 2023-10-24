package lexicon;


import java.util.ArrayList;
import java.util.List;

public class TodoItemTask {
    public List<TodoItemTask> todoItemTaskCollection;

    public TodoItemTask() {
        todoItemTaskCollection = new ArrayList<>();
    }

    public void persist(TodoItemTask todoItemTask) {
        todoItemTaskCollection.add(todoItemTask);
    }

    public TodoItemTask findById(int id) {
        for (TodoItemTask task : todoItemTaskCollection) {
            if (isaBoolean(id, task)) return task;
            continue;
        }
        return null; // TodoItemTask not found
    }

    private static boolean isaBoolean(int id, TodoItemTask task) {
        return task.getId() == id;
    }

    private int getId() {
        return 0;
    }

    public List<TodoItemTask> findAll() {
        return todoItemTaskCollection;
    }

    public List<TodoItemTask> findByAssignedStatus(boolean assigned) {
        List<TodoItemTask> result = new ArrayList<>();
        for (TodoItemTask task : todoItemTaskCollection) {
            if (task.isAssigned() == assigned) {
                result.add(task);
            }
        }
        return result;
    }

    private boolean isAssigned(){
        return false;
    }

    public List<TodoItemTask> findByPersonId(int personId) {
        List<TodoItemTask> result = new ArrayList<>();
        for (TodoItemTask task : todoItemTaskCollection) {
            if (task.getAssignee().getId() == personId) {
                result.add(task);
            }
        }
        return result;
    }

    private TodoItemTask getAssignee() {
        return null;
    }

    public void remove(TodoItemTask todoItemTask) {
        todoItemTaskCollection.remove(todoItemTask);
    }
}
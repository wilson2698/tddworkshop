package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<String, Task>();

   public void addTask(Task task) {
      // Add code here
      tasks.put(task.getDescription(), task);
   }

   public void completeTask(String description) {
      // Add code here
   }

   public boolean getStatus(String description) {
      // Add code here
      return tasks.get(description).isComplete();
   }

   public Task getTask(String description) {
      // Add code here
      return null;
   }

   public Task removeTask(String description) {
      // Add code here
      tasks.remove(description);
      return null;
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      Collection <Task> completedTasks = new ArrayList<>();

      for (Task task: tasks.values()){
         if (task.isComplete()){
            completedTasks.add(task);
         }
      }

      return completedTasks;
   }
}

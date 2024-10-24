package sg.edu.nus.iss.epat.tdd.workshop;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
   private HashMap<String, Task> tasks = new HashMap<>();

   public void addTask(Task task) {
      this.tasks.put(task.getDescription(), task);
   }

   public void completeTask(String description) {
      Task target = this.tasks.get(description);
      target.setComplete(true);
      this.tasks.replace(target.getDescription(), target);
   }

   public boolean getStatus(String description) {
      // Add code here
      return this.tasks.get(description).isComplete();
   }

   public Task getTask(String description) {
      // Add code here
      return this.tasks.get(description);
   }

   public Task removeTask(String description) {
      // Add code here
       return this.tasks.remove(description);
   }

   public Collection<Task> getAllTasks() {
      return tasks.values();
   }

   public Collection<Task> getCompletedTasks() {
      // Add code here
      Collection<Task> results = new ArrayList<>();
      for (Task task : this.getAllTasks())
      {
         if (task.isComplete())
         {
            results.add(task);
         }
      }
      return results;
   }
}

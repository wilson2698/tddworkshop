package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ToDoListTest  {
    // Define Test Fixtures
    private ToDoList ToDoListTestList;
    private Task task1;

    private String DESC1 = "Hello 1";
    private Boolean STATUS1 = false;

    private Task task2;
    private String DESC2 = "Hello 3";
    private Boolean STATUS2 = true;

    private Task task3;
    private String DESC3 = "Hello 3";
    private Boolean STATUS3 = true;

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        ToDoListTestList = new ToDoList();
        task1 = new Task(DESC1, STATUS1);
        task2 = new Task(DESC2, STATUS2);
        task3 = new Task(DESC3, STATUS3);
        
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures

    }

    @Test
    public void testAddTask() {
        ToDoListTestList.addTask(task1);
        assertEquals(1,ToDoListTestList.getAllTasks().size());
    }

    @Test
    public void testGetStatus() {
        ToDoListTestList.addTask(task1);
        assertEquals(STATUS1, ToDoListTestList.getStatus(DESC1));
    }

    @Test
    public void testRemoveTask() {
        ToDoListTestList.addTask(task1);
        ToDoListTestList.removeTask(DESC1);
        assertEquals(0,ToDoListTestList.getAllTasks().size());
    }

    @Test
    public void testGetCompletedTasks() {
        ToDoListTestList.addTask(task1);
        ToDoListTestList.addTask(task2);
        ToDoListTestList.addTask(task3);
        assertEquals(1, ToDoListTestList.getCompletedTasks().size());

    }
}
package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ToDoListTest  {
    // Define Test Fixtures
    private HashMap<String, Task> testTasks = new HashMap<>();
    private ToDoList ToDoListTestList;

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        ToDoListTestList = new ToDoList();
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures

    }

    @Test
    public void testAddTask() {
        Task testAdd1 = new Task("task3", false);
        ToDoListTestList.addTask(testAdd1);
        assertEquals(1,ToDoListTestList.getAllTasks().size());
    }

    @Test
    public void testGetStatus() {
        fail("Not implemented yet");
    }

    @Test
    public void testRemoveTask() {
        fail("Not implemented yet");
    }

    @Test
    public void testGetCompletedTasks() {
        fail("Not implemented yet");
    }
}
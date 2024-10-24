package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.fail;

public class ToDoListTest  {
    // Define Test Fixtures
    private HashMap<String, Task> testTasks = new HashMap<>();

    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        Task testData1 = new Task("task 1", false);
        testTasks.put("test1", testData1);
        Task testData2 = new Task("task 2", true);
        testTasks.put("test2", testData2);
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures

    }

    @Test
    public void testAddTask() {
        fail("Not implemented yet");
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
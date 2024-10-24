package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import static org.junit.Assert.*;

public class ToDoListTest  {
    // Define Test Fixtures
    private ToDoList testList;
    private Task testAdd1;
    private Task testAdd2;


    public ToDoListTest() {
        super();
    }

    @Before
    public void setUp() throws Exception {
        // Initialise Test Fixtures
        this.testList = new ToDoList();
        this.testAdd1 = new Task("task1", false);
        this.testAdd2 = new Task("task2", true);
    }

    @After
    public void tearDown() throws Exception {
        // Uninitialise test Fixtures
    }

    @Test
    public void testAddTask()
    {
        this.testList.addTask(this.testAdd1);
        assertEquals(this.testAdd1, this.testList.getTask("task1"));
        this.testList.addTask(this.testAdd2);
        assertEquals(this.testAdd2, this.testList.getTask("task2"));
    }

    @Test
    public void testGetStatus()
    {
        this.testList.addTask(testAdd1);
        boolean status1 = this.testList.getStatus("task1");
        assertFalse(status1);
        this.testList.addTask(testAdd2);
        boolean status2 = this.testList.getStatus("task2");
        assertTrue(status2);
    }

    @Test
    public void testRemoveTask()
    {
        this.testList.addTask(this.testAdd1);
        this.testList.addTask(this.testAdd2);
        Task removed1 = this.testList.removeTask("task1");
        assertEquals(1, this.testList.getAllTasks().size());
        assertEquals(this.testAdd1, removed1);
        Task removed2 = this.testList.removeTask("task2");
        assertEquals(0, this.testList.getAllTasks().size());
        assertEquals(this.testAdd2, removed2);
    }

    @Test
    public void testGetCompletedTasks()
    {
        this.testList.addTask(this.testAdd1);
        this.testList.addTask(this.testAdd2);
        Collection<Task> result = new ArrayList<>();
        result.add(this.testAdd2);
        assertEquals(result, this.testList.getCompletedTasks());
    }
}
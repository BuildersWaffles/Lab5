package taskTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import task.Task;
import task.SimpleTask;

public class SimpleTaskTest {

    @Test
    void simpleTaskExecuted() {
        Task simpleTask = new SimpleTask("Test task");
        String result = simpleTask.execute();
        assertEquals("Simple task Test task was executed", result);
    }
    @Test
    void simpleTaskGetName() {
        Task simpleTask = new SimpleTask("Test task");
        assertEquals("Test task", ((SimpleTask) simpleTask).getName());
    }
}
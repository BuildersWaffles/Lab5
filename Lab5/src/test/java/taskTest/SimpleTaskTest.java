package taskTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import task.Task;
import task.SimpleTask;

public class SimpleTaskTest {

    @Test
    void simpleTaskExecuted() {
        SimpleTask simpleTask = new SimpleTask("Test task");
        String result = simpleTask.execute();
        String expected = "Starting task: Test taskExecuting simple task: Test task" +
                "Finishing task: Test taskCleaning up resources for task: Test task";

        assertEquals(expected, result);
    }

    @Test
    void simpleTaskGetName() {
        SimpleTask simpleTask = new SimpleTask("Test task");
        assertEquals("Test task", simpleTask.getName());
    }

    @Test
    void simpleTaskIsReady() {
        SimpleTask simpleTask = new SimpleTask("Test task");
        Boolean readiness = simpleTask.checkReadiness();

        assertTrue(readiness);
    }
}

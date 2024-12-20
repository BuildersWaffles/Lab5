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
        assertEquals("Simple task Test task was executed", result);
    }
    @Test
    void simpleTaskGetName() {
        SimpleTask simpleTask = new SimpleTask("Test task");
        assertEquals("Test task", simpleTask.getName());
    }

    @Test
    void simpleTaskCleanUp() {
        Task simpleTask = new SimpleTask("Test task");
        String cleanUpResult = simpleTask.cleanUp();

        assertEquals("Cleaning up resources for simple task: Test task", cleanUpResult);
    }

    @Test
    void simpleTaskIsReady() {
        SimpleTask simpleTask = new SimpleTask("Test task");
        Boolean readiness = simpleTask.checkReadiness();

        assertEquals(Boolean.TRUE, readiness);
    }

}
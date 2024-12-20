package taskTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import task.*;

public class ComplexTaskTest {

    @Test
    void testComplexTask() {
        Task subtask1 = new SimpleTask("subtask 1");
        ComplexTask complexTask = new ComplexTask("complex task");

        complexTask.add(subtask1);

        String result = complexTask.execute();
        String expected = "Starting task: complex task\nExecuting complex task: complex task\n" +
                "Starting task: subtask 1\nExecuting simple task: subtask 1\n" +
                "Finishing task: subtask 1\nCleaning up resources for task: subtask 1\n" +
                "Finishing task: complex task\nCleaning up resources for task: complex task\n" +
                "Additional cleanup for complex task: complex task\n";

        assertEquals(expected, result);
    }

    @Test
    void complexTaskGetName() {
        ComplexTask complexTask = new ComplexTask("Test complex task");
        assertEquals("Test complex task", complexTask.getName());
    }

    @Test
    void testComplexTaskReadiness() {
        ComplexTask complexTask = new ComplexTask("Main Task");

        assertFalse(complexTask.checkReadiness(),
                "ComplexTask should not be ready if there are no subtasks.");

        complexTask.add(new SimpleTask("Subtask"));
        assertTrue(complexTask.checkReadiness(),
                "ComplexTask should be ready if it contains subtasks.");
    }
}
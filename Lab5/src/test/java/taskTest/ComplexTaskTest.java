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
        String expected = "Starting task: complex taskExecuting complex task: complex task" +
                "Starting task: subtask 1Executing simple task: subtask 1" +
                "Finishing task: subtask 1Cleaning up resources for task: subtask 1" + "Finishing task: "
               + "complex taskAdditional cleanup for complex task: complex task";
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

        complexTask.add(new SimpleTask("Subtask"));
        assertTrue(complexTask.checkReadiness(),
                "ComplexTask should be ready if it contains subtasks.");
    }
}
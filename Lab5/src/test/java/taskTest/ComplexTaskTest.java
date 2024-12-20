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
        assertEquals("Complex task complex task was executed with subtasks:Simple task subtask 1 was executed", result);
    }

    @Test
    void complexTaskGetName() {
        ComplexTask сomplexTask = new ComplexTask("Test complex task");
        assertEquals("Test complex task", сomplexTask.getName());

    }
    
    @Test
    void complexTaskCleanUp() {
        ComplexTask complexTask = new ComplexTask("Test task");
        String cleanUpResult = complexTask.cleanUp();

        assertEquals("Cleaning up resources for complex task: Test task", cleanUpResult);
    }
    @Test
    void testComplexTaskReadiness() {
        ComplexTask complexTask = new ComplexTask("Main Task");

        assertEquals(Boolean.FALSE, complexTask.checkReadiness(),
                "ComplexTask should not be ready if there are no subtasks.");

        complexTask.add(new SimpleTask("Subtask"));
        assertEquals(Boolean.TRUE, complexTask.checkReadiness(),
                "ComplexTask should be ready if it contains subtasks.");
    }
}

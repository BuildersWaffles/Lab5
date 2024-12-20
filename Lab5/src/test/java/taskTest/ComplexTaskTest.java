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
}

package taskTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import task.*;

public class ComplexTaskTest {

    @Test
    void testComplexTask() {
        Task subtask1 = new SimpleTask("subtask 1");
        ComplexTask complexTask = new ComplexTask("Complex Task");

        complexTask.add(subtask1);
        complexTask.execute();

        assertDoesNotThrow(() -> complexTask.execute());
    }
}

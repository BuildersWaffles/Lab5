import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import task.*;

public class SimpleTaskTest {

    @Test
    void simpleTaskExecuted() {
        Task simpleTask = new SimpleTask();
        String result = simpleTask.execute();
        assertEquals("Simple task was executed", result);
    }
    @Test
    void simpleTaskGetName() {
        Task simpleTask = new SimpleTask("Test task");
        assertEquals("Test task", simpleTask.getName());
    }
}
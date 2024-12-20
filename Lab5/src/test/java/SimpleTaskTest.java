import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SimpleTaskTest {

    @Test
     void simpleTaskGetExecuted() {
        Task simpleTask = new SimpleTask();
        assertEquals("Simple task was executed", SimpleTask.execute);
    }
}

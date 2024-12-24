package task;

import java.util.ArrayList;
import java.util.List;

public class ComplexTask extends AbstractTask {
    private List<Task> subtasks = new ArrayList<>();

    public ComplexTask(String name) {
        super(name);
    }

    public void add(Task task) {
        subtasks.add(task);
    }

    @Override
    protected String doExecute() {
        StringBuilder result = new StringBuilder("Executing complex task: " + getName());
        for (Task subtask : subtasks) {
            result.append(subtask.execute());
        }
        return result.toString();
    }

    @Override
    public String cleanUp() {
        super.cleanUp();
        return "Additional cleanup for complex task: " + getName();
    }
}

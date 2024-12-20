package task;

import java.util.ArrayList;
import java.util.List;

public class ComplexTask implements Task {
    private final String name;
    private final List<Task> subtasks;

    public ComplexTask(String name) {
        this.name = name;
        this.subtasks = new ArrayList<>();
    }

    public void add(Task task) {
        subtasks.add(task);
    }

    @Override
    public String execute() {
        StringBuilder result = new StringBuilder("Complex task " + name + " was executed with subtasks:");

        for (Task subtask : subtasks) {
            result.append(subtask.execute());
        }

        return result.toString();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String cleanUp() {
        return "";
    }
    @Override
    public boolean checkReadiness() {
        return !subtasks.isEmpty();
    }
}

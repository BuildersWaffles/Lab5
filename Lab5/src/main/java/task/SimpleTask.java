package task;

public class SimpleTask implements Task {
    private final String name;

    public SimpleTask(String name) {
        this.name = name;
    }
    @Override
    public String execute() {
        return "Simple task " + name + " was executed";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String cleanUp() {
        return "Cleaning up resources for simple task: " + name;
    }
}

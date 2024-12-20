package task;

public class SimpleTask implements Task {
    private final String name;

    public SimpleTask(String name) {
        this.name = name;
    }
    @Override
    public String execute() {
        return name + " was executed";
    }

    public String getName() {
        return name;
    }
}

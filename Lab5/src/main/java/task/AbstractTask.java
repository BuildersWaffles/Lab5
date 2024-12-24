package task;

public abstract class AbstractTask implements Task {
    private String name;

    public AbstractTask(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public final String execute() {
        if (!checkReadiness()) {
            return "Task " + name + " is not ready to execute.";
        }
        String result = start();
        result += doExecute();
        result += finish();
        result += cleanUp();
        return result;
    }

    protected abstract String doExecute();

    public boolean checkReadiness() {
        return true;
    }

    protected String start() {
        return "Starting task: " + name;
    }

    protected String finish() {
        return "Finishing task: " + name;
    }

    public String cleanUp() {
        return "Cleaning up resources for task: " + name;
    }
}

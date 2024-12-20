package task;

public class SimpleTask extends AbstractTask {
    public SimpleTask(String name) {
        super(name);
    }

    @Override
    protected String doExecute() {
        return "Executing simple task: " + getName();
    }
}


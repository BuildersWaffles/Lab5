package task;

public interface Task {
    String execute();
    String getName();
    String cleanUp();
    boolean checkReadiness();
}

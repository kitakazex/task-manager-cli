
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private final List<Task> tasks;

    public TaskRepository() {
        this.tasks = new ArrayList<>();
    }

    public void save(Task task) {
        tasks.add(task);
    }

    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }
}


import java.util.List;

public class TaskService {

    private final TaskRepository repository;
    private int nextId = 1;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public Task addTask(String title, String description) {

        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException(
                "タイトルを入力してください。"
            );
        }

        Task task = new Task(
            nextId,
            title.trim(),
            description == null ? "" : description
        );

        repository.save(task);
        nextId++;

        return task;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }
}

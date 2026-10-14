
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TaskRepository repository = new TaskRepository();

        Task task1 = new Task(
            1,
            "Java Silverの学習",
            "クラス設計の復習"
        );

        Task task2 = new Task(
            2,
            "GitHubの操作練習",
            "コミットとPushの確認"
        );

        repository.save(task1);
        repository.save(task2);

        List<Task> tasks = repository.findAll();

        for (Task task : tasks) {
            System.out.println(
                task.getId() + " : " + task.getTitle()
            );
        }
    }
}

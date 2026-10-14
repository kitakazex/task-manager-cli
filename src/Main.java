
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TaskRepository repository = new TaskRepository();
        TaskService service = new TaskService(repository);

        service.addTask(
            "Java Silverの学習",
            "クラス設計の復習"
        );

        service.addTask(
            "GitHubの操作練習",
            "コミットとPushの確認"
        );
        
        List<Task> tasks = service.getAllTasks();

        for (Task task : tasks) {
            System.out.println(
                task.getId() + " : " + task.getTitle()
            );
        }
    }
}

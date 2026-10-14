
public class Main {
    public static void main(String[] args) {

        Task task = new Task(
            1,
            "Java Silverの学習",
            "クラス設計の復習"
        );

        System.out.println("ID: " + task.getId());
        System.out.println("タイトル: " + task.getTitle());
        System.out.println("説明: " + task.getDescription());
        System.out.println("状態: " + task.getStatus());
    }
}

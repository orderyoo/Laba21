
interface Observer {
    void update(String message);
}

public class Main{
    public static void main(String[] args) {

        Group group1 = new Group("Арктида");
        Group group2 = new Group("Sabaton");
        Group group3 = new Group("Театр Теней");
        Group group4 = new Group("Король и Шут");

        User user1 = new User("Пользователь 1");
        User user2 = new User("Пользователь 2");

        group1.addObserver(user1);
        group1.addObserver(user2);

        group2.addObserver(user1);
        group2.addObserver(user2);

        group3.addObserver(user1);

        group4.addObserver(user2);

        group1.sendNotification("Новый альбом! 'Музыка ветра, земли и огня' на всех площадках!");
        group2.sendNotification("Новый альбом! 'Weapons Of The Modern Age' на всех площадках!");
        group3.sendNotification("'Кино' - альбому 5 лет!");
        group4.sendNotification("'Истиный Убийца' - альбому 30 лет!");
    }
}
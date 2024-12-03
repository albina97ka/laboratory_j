import java.util.ArrayList;
import java.util.List;

interface Observable {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(Notification notification);
}

class Group implements Observable {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String name;

    public Group(String name) {
        this.name = name;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(Notification notification) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(notification);
        }
    }

    public void newNotification(NotificationType type, String message) {
        Notification notification = new Notification(this.name, type, message);
        notifySubscribers(notification);
    }
}

interface Subscriber {
    void notify(Notification notification);
}

class Users implements Subscriber {
    private String name;

    public Users(String name) {
        this.name = name;
    }

    @Override
    public void notify(Notification notification) {
        System.out.println(this.name + " полученное уведомление:");
        notification.printNotification();
    }
}

enum NotificationType {
    NEW_POST,
    NEW_COMMENT,
    NEW_EVENT
}

class Notification {
    private String group;
    private NotificationType type;
    private String message;

    public Notification(String group, NotificationType type, String message) {
        this.group = group;
        this.type = type;
        this.message = message;
    }

    public void printNotification() {
        System.out.println("\tГруппа: " + this.group);
        System.out.println("\tТип уведомления: " + this.type);
        System.out.println("\tСообщение: " + this.message);
    }
}

public class Main21 {
    public static void main(String[] args) {
        Group group1 = new Group("Программист");
        Group group2 = new Group("Дом искусства");
        Group group3 = new Group("Сарказм");
        Group group4 = new Group("cute story");

        Users user1 = new Users("Пользователь Ярослав Кузнецов");
        Users user2 = new Users("Пользователь Алексей Смирнов");

        group1.addSubscriber(user1);
        group1.addSubscriber(user2);
        group2.addSubscriber(user1);
        group2.addSubscriber(user2);
        group3.addSubscriber(user1);
        group3.addSubscriber(user2);
        group4.addSubscriber(user1);

        group1.newNotification(NotificationType.NEW_POST, "Новое сообщение в группе");
        group2.newNotification(NotificationType.NEW_COMMENT, "Новое сообщение в группе");
        group3.newNotification(NotificationType.NEW_EVENT, "Новое событие в группе");
        group4.newNotification(NotificationType.NEW_POST, "Новое событие в группе");
    }
}
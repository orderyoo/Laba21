import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Observer> observers = new ArrayList<>();
    public Group(String name) {
        this.name = name;
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    public void sendNotification(String message) {
        notifyObservers(message);
    }
}

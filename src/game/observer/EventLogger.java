package game.observer;

public class EventLogger implements Observer {
    @Override
    public void update(String message) {
        System.out.println("LOG: " + message);
    }
}

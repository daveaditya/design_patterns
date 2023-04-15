package derekbanas.observer_pattern;

public interface Subject {

    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObserver();

}

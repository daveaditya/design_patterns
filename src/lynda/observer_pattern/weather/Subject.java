package lynda.observer_pattern.weather;

/**
 * Created by aditya on 3/1/17.
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}

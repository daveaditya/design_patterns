package lynda.observer_pattern.weather;

/**
 * Created by aditya on 3/1/17.
 */
public interface Observer {

    public void update(double temp, double humidity, double pressure);

}

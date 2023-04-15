package derekbanas.observer_pattern;


import java.util.ArrayList;

public class StockGrabber implements Subject {

    ArrayList<Observer> observers = new ArrayList<>();
    private double ibmPrice;
    private double aaplPrice;
    private double googlePrice;

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        System.out.println("Observer : " + (observerIndex + 1) + " deleted");
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googlePrice);
        }
    }

}

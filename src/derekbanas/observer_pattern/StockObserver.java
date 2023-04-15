package derekbanas.observer_pattern;


public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googlePrice;

    private static int observerIdTracker = 0;

    private int observerId;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = ++observerIdTracker;
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googlePrice = googlePrice;

        printPrices();
    }


    private void printPrices() {
        System.out.println(observerId + "\nIBM : " + ibmPrice + "\nAAPL : " + aaplPrice + "\nGoogle : " + googlePrice);
    }

}

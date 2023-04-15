package derekbanas.observer_pattern;


public class GrabStocks {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.60);
        stockGrabber.setGooglePrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setAaplPrice(677.60);
        stockGrabber.setGooglePrice(676.40);

        stockGrabber.unregister(observer1);

        Runnable getIbm = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAapl = new GetTheStock(stockGrabber, 2, "AAPL", 677.60);
        Runnable getGoogle = new GetTheStock(stockGrabber, 2, "GOOGLE", 676.40);

        new Thread(getIbm).start();
        new Thread(getAapl).start();
        new Thread(getGoogle).start();
    }

}

package derekbanas.observer_pattern;

import java.text.DecimalFormat;
import java.util.Objects;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int startTime, String stock, double price) {
        this.stockGrabber = stockGrabber;
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public void run() {

        for (int i = 0; i <= 20; i++) {
            try {
                Thread.sleep(2000);

            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
            double randNum = (Math.random() * 0.06) - 0.03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.parseDouble(df.format(price + randNum));

            if (Objects.equals(stock, "IBM")) {
                ((StockGrabber) stockGrabber).setIbmPrice(price);
            }
            if (Objects.equals(stock, "AAPL")) {
                ((StockGrabber) stockGrabber).setAaplPrice(price);
            }
            if (Objects.equals(stock, "GOOGLE")) {
                ((StockGrabber) stockGrabber).setGooglePrice(price);
            }
            System.out.println(stock + " : " + df.format((price + randNum)) + " " + df.format(randNum));
            System.out.println();
        }

    }

}

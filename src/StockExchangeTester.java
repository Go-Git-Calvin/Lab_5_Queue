/**
 * StockExchangeTester.java
 * <p/>
 * Calvin Wong
 * <p/>
 * Tester for StockExchange
 */

public class StockExchangeTester {

    public static void main(String[] args) {

        StockExchange dow = new StockExchange();
        dow.buyShares(100, 20);
        dow.buyShares(20, 24);
        dow.buyShares(200, 36);
        dow.showPortfolio();
        dow.sellShares(150, 30);

    }
} // end of class
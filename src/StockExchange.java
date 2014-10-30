/**
 * StockExchange.java
 *
 * Calvin Wong
 *
 * A Class that implements Queue
 */

import java.util.Queue;
import java.util.ArrayDeque;

public class StockExchange {

    private Queue<Share> portfolio;

    public StockExchange() {
        portfolio = new ArrayDeque<Share>();
    }

    public void buyShares(int numShares, int buyPrice) {
        for (int i = 1; i <= numShares; i++) {
            portfolio.offer(new Share(buyPrice));
        }
    }

    public void showPortfolio() {
        int currentPrice = portfolio.peek().getPrice();
        int totalShares = 0;
        int numShares = 0;
        for (Share share : portfolio) {
            if (share.getPrice() == currentPrice) {
                numShares++;
                totalShares++;
            } else {
                System.out.println("" + numShares + " shares bought at " + currentPrice);
                currentPrice = share.getPrice();
                totalShares++;
                numShares = 1;
            }
        }
        System.out.println("" + numShares + " shares bought at " + currentPrice);
        System.out.println("Total Shares Owned: " + totalShares);

    }

    public void sellShares(int numSold, int sellPrice) {
        if (numSold > portfolio.size()) {
            throw new IndexOutOfBoundsException("You don't have that many shares");
        }
        int currentPrice = portfolio.peek().getPrice();
        int numShares = 0;
        int capital = 0;
        for (int i = 0; i < numSold; i++) {
            if (portfolio.peek().getPrice() == currentPrice) {
                numShares++;
                capital += portfolio.poll().sell(sellPrice);
            } else {
                System.out.println("" + numShares + " shares sold at gain/loss of "
                        + (sellPrice - currentPrice) + " each");
                numShares = 1;
                currentPrice = portfolio.peek().getPrice();
                capital += portfolio.poll().sell(sellPrice);
            }
        }
        System.out.println("" + numShares + " shares sold at gain/loss of "
                + (sellPrice - currentPrice) + " each");
        System.out.println("Capital Gains from sale: " + capital);
    }
} // end of class
  
/**
 * Share.java
 *
 * Calvin Wong
 *
 * Share Class to hold price
 */

public class Share {

    private int buyPrice;

    public Share(int price) {
        buyPrice = price;
    }

    public void setPrice(int price) {
        buyPrice = price;
    }

    public int getPrice() {
        return buyPrice;
    }

    public int sell(int sellPrice) {
        return sellPrice - buyPrice;
    }

    public String toString() {
        return "" + buyPrice + "\n";
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Share share = (Share) o;

        if (buyPrice != share.buyPrice) return false;

        return true;
    }

} // end of class
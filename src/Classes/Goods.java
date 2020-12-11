package Classes;

public abstract class Goods {
    int stock;
    int available;
    int incart;
    int id;

    @Override
    public String toString() {
        return "Goods{" +
                "stock=" + stock +
                ", available=" + available +
                ", incart=" + incart +
                '}';
    }

    public void updateAvailable(int newincart) {
        this.available = this.stock-this.incart -newincart;
    }

    public void setIncart(int incart) {
        this.incart += incart;
    }

    public void updateStock() {
        this.stock = this.stock-this.incart;
    }

    public boolean isEnoughforCart() {
        if(this.available<=0){
            return false;
        }else {
            return true;
        }
    }
    public boolean isEnoughToBuy() {
        if(stock<0){
            return false;
        }else {
            return true;
        }
    }

    public int getId() {
        return id;
    }
}
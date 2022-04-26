package collectionframework.arraylistlinkedlist;

public class MoreProducts {

    private String name;
    private int rate;
    private String quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "MoreProducts{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}

package collectionframework.linkedhashset;

import java.util.Objects;

public class Credits {


    private String customerName;
    private int amount;
    private String type;
    private String status;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Credits credits = (Credits) o;
        return amount == credits.amount && customerName.equals(credits.customerName) && type.equals(credits.type) && status.equals(credits.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerName, amount, type, status);
    }

    @Override
    public String toString() {
        return "Credits{" +
                "customerName='" + customerName + '\'' +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

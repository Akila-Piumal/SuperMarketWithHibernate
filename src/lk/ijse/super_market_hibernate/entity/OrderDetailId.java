package lk.ijse.super_market_hibernate.entity;

import java.io.Serializable;
import java.util.Objects;

public class OrderDetailId implements Serializable {
    private String item;
    private String order;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailId that = (OrderDetailId) o;
        return Objects.equals(item, that.item) && Objects.equals(order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, order);
    }
}

package lk.ijse.super_market_hibernate.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(OrderDetailId.class)
public class OrderDetail implements Serializable {
    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_code",referencedColumnName = "itemCode")
    private Item item;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Order_id",referencedColumnName = "orderId")
    private Order order;

    private int qty;

    public OrderDetail() {
    }

    public OrderDetail(Item item, Order order, int qty) {
        this.item = item;
        this.order = order;
        this.qty = qty;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "item=" + item +
                ", order=" + order +
                ", qty=" + qty +
                '}';
    }
}

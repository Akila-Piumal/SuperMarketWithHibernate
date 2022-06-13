package lk.ijse.super_market_hibernate.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item implements Serializable {
    @Id
    private String itemCode;
    private String description;
    private int qtyOnHand;
    private double price;

    @OneToMany(mappedBy = "item")
    private List<OrderDetail> orderDetails=new ArrayList<>();

    public Item() {
    }

    public Item(String itemCode, String description, int qtyOnHand, double price, List<OrderDetail> orderDetails) {
        this.itemCode = itemCode;
        this.description = description;
        this.qtyOnHand = qtyOnHand;
        this.price = price;
        this.orderDetails = orderDetails;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode='" + itemCode + '\'' +
                ", description='" + description + '\'' +
                ", qtyOnHand=" + qtyOnHand +
                ", price=" + price +
                ", orderDetails=" + orderDetails +
                '}';
    }
}

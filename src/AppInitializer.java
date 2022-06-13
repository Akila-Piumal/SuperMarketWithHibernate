import lk.ijse.super_market_hibernate.entity.Customer;
import lk.ijse.super_market_hibernate.entity.Item;
import lk.ijse.super_market_hibernate.entity.Order;
import lk.ijse.super_market_hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        c1.setId("C001");
        c1.setName("Akila");
        c1.setAddress("Mathugama");
        c1.setSalary(90000);

        Customer c2 = new Customer();
        c2.setId("C001");
        c2.setName("Akila");
        c2.setAddress("Kaluthara");
        c2.setSalary(100000);

        Item p1 = new Item();
        p1.setItemCode("P001");
        p1.setDescription("Sunlight");
        p1.setQtyOnHand(100);
        p1.setPrice(150);

        Item p2 = new Item();
        p2.setItemCode("P001");
        p2.setDescription("Sunlight");
        p2.setQtyOnHand(200);
        p2.setPrice(200);

        Order O1 = new Order();
        O1.setOrderId("OID-001");
        O1.setCustomer(c1);

        Order O2 = new Order();
        O2.setOrderId("OID-002");
        O2.setCustomer(c1);

        c1.getOrderList().add(O1);
        c1.getOrderList().add(O2);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        // Save Customer
        //session.save(c1);

        // Update Customer
        //session.update(c2);

        // search Customer
        // Customer customer = session.get(Customer.class, "C001");
        // System.out.println(customer);

        // delete Customer
        // session.delete(customer);

        // Save Item
        // session.save(p1);

        // Update Item
        // session.update(p2);

        // search Item
        // Item item = session.get(Item.class, "P001");
        // System.out.println(item);

        // delete Item
        // session.delete(item);

        // Save Order
        // session.save(c1);
        // session.save(O1);
        // session.save(O2);

        // Search Order
        Order order = session.get(Order.class, "OID-001");
        System.out.println(order);

        // Delete Order
        session.delete(order);

        transaction.commit();

        session.close();
    }
}

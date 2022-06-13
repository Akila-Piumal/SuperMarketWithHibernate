import lk.ijse.super_market_hibernate.entity.Customer;
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



        transaction.commit();

        session.close();
    }
}

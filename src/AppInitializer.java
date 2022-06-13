import lk.ijse.super_market_hibernate.entity.Customer;
import lk.ijse.super_market_hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Customer c1=new Customer();

        c1.setId("C001");
        c1.setName("Akila");
        c1.setAddress("Mathugama");
        c1.setSalary(90000);

        Customer c2=new Customer();
        c2.setId("C001");
        c2.setName("Akila");
        c2.setAddress("Kaluthara");
        c2.setSalary(100000);

        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        //session.save(c1);

        session.update(c2);

        transaction.commit();

        session.close();
    }
}

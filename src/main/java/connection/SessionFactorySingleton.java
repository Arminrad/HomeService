package connection;

import entities.*;
import entities.base.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactorySingleton {
    private SessionFactorySingleton() {}

    private static class Holder {
        static SessionFactory INSTANCE;

        static {
            var registry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml")
                    .build();


            INSTANCE = new MetadataSources(registry)
                    .addAnnotatedClass(User.class)
                    .addAnnotatedClass(Comment.class)
                    .addAnnotatedClass(Customer.class)
                    .addAnnotatedClass(Offer.class)
                    .addAnnotatedClass(Order.class)
                    .addAnnotatedClass(Professional.class)
                    .addAnnotatedClass(Service.class)
                    .buildMetadata()
                    .buildSessionFactory();
        }
    }

    public static SessionFactory getInstance() {
        return Holder.INSTANCE;
    }
}

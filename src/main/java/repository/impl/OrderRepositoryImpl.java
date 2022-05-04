package repository.impl;

import connection.SessionFactorySingleton;
import entities.Order;
import org.hibernate.SessionFactory;
import repository.OrderRepository;
import repository.base.impl.GenericRepositoryImpl;


public class OrderRepositoryImpl extends GenericRepositoryImpl<Order, Integer> implements OrderRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

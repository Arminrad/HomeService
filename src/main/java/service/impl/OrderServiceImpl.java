package service.impl;

import connection.SessionFactorySingleton;
import entities.Order;
import org.hibernate.SessionFactory;
import repository.impl.CommentRepositoryImpl;
import repository.impl.OrderRepositoryImpl;
import service.OrderService;
import service.base.impl.BaseServiceImpl;

public class OrderServiceImpl extends BaseServiceImpl<Order, Integer> implements OrderService {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    private OrderRepositoryImpl orderRepository = new OrderRepositoryImpl();
}

package service.impl;

import connection.SessionFactorySingleton;
import entities.Customer;
import org.hibernate.SessionFactory;
import repository.impl.CommentRepositoryImpl;
import repository.impl.CustomerRepositoryImpl;
import service.CustomerService;
import service.base.impl.BaseServiceImpl;

public class CustomerServiceImpl extends BaseServiceImpl<Customer, Integer> implements CustomerService {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    private CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
}

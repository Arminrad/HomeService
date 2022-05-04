package repository.impl;

import connection.SessionFactorySingleton;
import entities.Customer;
import org.hibernate.SessionFactory;
import repository.CustomerRepository;
import repository.base.impl.BaseRepositoryImpl;

public class CustomerRepositoryImpl extends BaseRepositoryImpl<Customer, Integer> implements CustomerRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

package repository.impl;

import connection.SessionFactorySingleton;
import entities.Customer;
import org.hibernate.SessionFactory;
import repository.CustomerRepository;
import repository.base.impl.GenericRepositoryImpl;

public class CustomerRepositoryImpl extends GenericRepositoryImpl<Customer, Integer> implements CustomerRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

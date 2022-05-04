package repository.impl;

import connection.SessionFactorySingleton;
import entities.Service;
import org.hibernate.SessionFactory;
import repository.ServiceRepository;
import repository.base.impl.GenericRepositoryImpl;

public class ServiceRepositoryImpl extends GenericRepositoryImpl<Service, Integer> implements ServiceRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

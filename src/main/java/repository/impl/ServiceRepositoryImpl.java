package repository.impl;

import connection.SessionFactorySingleton;
import entities.Service;
import org.hibernate.SessionFactory;
import repository.ServiceRepository;
import repository.base.impl.BaseRepositoryImpl;

public class ServiceRepositoryImpl extends BaseRepositoryImpl<Service, Integer> implements ServiceRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

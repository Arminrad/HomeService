package service.impl;

import connection.SessionFactorySingleton;
import entities.Service;
import org.hibernate.SessionFactory;
import repository.impl.CommentRepositoryImpl;
import repository.impl.ServiceRepositoryImpl;
import service.ServiceService;
import service.base.impl.BaseServiceImpl;

public class ServiceServiceImpl extends BaseServiceImpl<Service, Integer> implements ServiceService {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    private ServiceRepositoryImpl serviceRepository = new ServiceRepositoryImpl();
}

package service.base.impl;

import connection.SessionFactorySingleton;
import org.hibernate.SessionFactory;
import repository.base.impl.BaseRepositoryImpl;
import service.base.BaseService;

import java.io.Serializable;
import java.util.List;

public class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

    private BaseRepositoryImpl<T, ID> baseRepositoryImpl = new BaseRepositoryImpl<>();
    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();


    @Override
    public T save(T t) {
        try (var session = sessionFactory.getCurrentSession()) {
            var transaction = session.getTransaction();
            transaction.begin();
            baseRepositoryImpl.save(t);
            transaction.commit();
            return t;
        }
    }

    @Override
    public T update(T t) {
        try (var session = sessionFactory.getCurrentSession()) {
            var transaction = session.getTransaction();
            transaction.begin();
            T updateT = baseRepositoryImpl.update(t);
            transaction.commit();
            return updateT;
        }
    }

    @Override
    public void delete(T t) {
        try (var session = sessionFactory.getCurrentSession()) {
            var transaction = session.getTransaction();
            transaction.begin();
            baseRepositoryImpl.delete(t);
            transaction.commit();
        }
    }

    @Override
    public T findById(Class<T> clazz, ID id) {
        try (var session = sessionFactory.getCurrentSession()) {
            var transaction = session.getTransaction();
            transaction.begin();
            T foundedT = baseRepositoryImpl.findById(clazz, id);
            transaction.commit();
            return foundedT;
        }
    }

    @Override
    public List<T> findAll(Class<T> clazz) {
        try (var session = sessionFactory.getCurrentSession()) {
            var transaction = session.getTransaction();
            transaction.begin();
            List<T> listOfT = baseRepositoryImpl.findAll(clazz);
            transaction.commit();
            return listOfT;
        }
    }
}

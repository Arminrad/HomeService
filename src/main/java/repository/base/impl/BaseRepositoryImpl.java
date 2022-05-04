package repository.base.impl;

import connection.SessionFactorySingleton;
import org.hibernate.SessionFactory;
import repository.base.BaseRepository;

import java.io.Serializable;
import java.util.List;

public class BaseRepositoryImpl<T, ID extends Serializable> implements BaseRepository<T, ID> {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
    private Class<T> tClass;

    public BaseRepositoryImpl(Class<T> tClass) {
        this.tClass = tClass;
    }

    public BaseRepositoryImpl() {
    }

    @Override
    public T save(T t) {
        var session = sessionFactory.getCurrentSession();
        try {
            session.save(t);
            return t;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public T update(T t) {
        var session = sessionFactory.getCurrentSession();
        try {
            session.update(t);
            return t;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void delete(T t) {
        var session = sessionFactory.getCurrentSession();
        try {
            session.delete(t);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public T findById(Class<T> clazz, ID id) {
        var session = sessionFactory.getCurrentSession();
        try {
            return session.createQuery("SELECT t FROM" + clazz.getSimpleName() + " t WHERE t.id = :id", clazz)
                    .setParameter("id", id)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<T> findAll(Class<T> clazz) {
        var session = sessionFactory.getCurrentSession();
        try {
            return session.createQuery("FROM" + clazz.getSimpleName(), clazz)
                    .getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}

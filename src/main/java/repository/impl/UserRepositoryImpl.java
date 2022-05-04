package repository.impl;

import connection.SessionFactorySingleton;
import entities.base.User;
import org.hibernate.SessionFactory;
import repository.UserRepository;
import repository.base.impl.BaseRepositoryImpl;

public class UserRepositoryImpl extends BaseRepositoryImpl<User, Integer> implements UserRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

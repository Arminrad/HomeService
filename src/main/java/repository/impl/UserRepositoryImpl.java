package repository.impl;

import connection.SessionFactorySingleton;
import entities.base.User;
import org.hibernate.SessionFactory;
import repository.UserRepository;
import repository.base.impl.GenericRepositoryImpl;

public class UserRepositoryImpl extends GenericRepositoryImpl<User, Integer> implements UserRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

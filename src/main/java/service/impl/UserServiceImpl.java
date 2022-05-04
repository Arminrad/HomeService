package service.impl;

import connection.SessionFactorySingleton;
import entities.base.User;
import org.hibernate.SessionFactory;
import repository.impl.CommentRepositoryImpl;
import repository.impl.UserRepositoryImpl;
import service.UserService;
import service.base.impl.BaseServiceImpl;

public class UserServiceImpl extends BaseServiceImpl<User, Integer> implements UserService {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    private UserRepositoryImpl userRepository = new UserRepositoryImpl();
}

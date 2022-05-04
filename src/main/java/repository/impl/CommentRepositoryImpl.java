package repository.impl;

import connection.SessionFactorySingleton;
import entities.Comment;
import org.hibernate.SessionFactory;
import repository.CommentRepository;
import repository.base.impl.BaseRepositoryImpl;

public class CommentRepositoryImpl extends BaseRepositoryImpl<Comment, Integer> implements CommentRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

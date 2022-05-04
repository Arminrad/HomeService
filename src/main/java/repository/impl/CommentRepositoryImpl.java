package repository.impl;

import connection.SessionFactorySingleton;
import entities.Comment;
import org.hibernate.SessionFactory;
import repository.CommentRepository;
import repository.base.impl.GenericRepositoryImpl;

public class CommentRepositoryImpl extends GenericRepositoryImpl<Comment, Integer> implements CommentRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

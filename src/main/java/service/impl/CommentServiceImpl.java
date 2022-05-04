package service.impl;

import connection.SessionFactorySingleton;
import entities.Comment;
import org.hibernate.SessionFactory;
import repository.impl.CommentRepositoryImpl;
import service.CommentService;
import service.base.BaseService;
import service.base.impl.BaseServiceImpl;

public class CommentServiceImpl extends BaseServiceImpl<Comment, Integer> implements CommentService {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    private CommentRepositoryImpl commentRepository = new CommentRepositoryImpl();
}

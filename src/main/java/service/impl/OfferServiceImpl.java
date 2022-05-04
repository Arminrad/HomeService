package service.impl;

import connection.SessionFactorySingleton;
import entities.Offer;
import org.hibernate.SessionFactory;
import repository.impl.CommentRepositoryImpl;
import repository.impl.OfferRepositoryImpl;
import service.OfferService;
import service.base.impl.BaseServiceImpl;

public class OfferServiceImpl extends BaseServiceImpl<Offer, Integer> implements OfferService {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    private OfferRepositoryImpl offerRepository = new OfferRepositoryImpl();
}

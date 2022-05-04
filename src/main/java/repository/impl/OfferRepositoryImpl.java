package repository.impl;

import connection.SessionFactorySingleton;
import entities.Offer;
import org.hibernate.SessionFactory;
import repository.OfferRepository;
import repository.base.impl.BaseRepositoryImpl;

public class OfferRepositoryImpl extends BaseRepositoryImpl<Offer, Integer> implements OfferRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

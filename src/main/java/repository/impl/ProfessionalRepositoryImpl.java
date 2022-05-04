package repository.impl;

import connection.SessionFactorySingleton;
import entities.Professional;
import org.hibernate.SessionFactory;
import repository.ProfessionalRepository;
import repository.base.impl.BaseRepositoryImpl;

public class ProfessionalRepositoryImpl extends BaseRepositoryImpl<Professional, Integer> implements ProfessionalRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

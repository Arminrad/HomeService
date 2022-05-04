package repository.impl;

import connection.SessionFactorySingleton;
import entities.Professional;
import org.hibernate.SessionFactory;
import repository.ProfessionalRepository;
import repository.base.impl.GenericRepositoryImpl;

public class ProfessionalRepositoryImpl extends GenericRepositoryImpl<Professional, Integer> implements ProfessionalRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();
}

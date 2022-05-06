package service.impl;

import connection.SessionFactorySingleton;
import entities.Professional;
import org.hibernate.SessionFactory;
import repository.impl.CommentRepositoryImpl;
import repository.impl.ProfessionalRepositoryImpl;
import service.ProfessionalService;
import service.base.impl.BaseServiceImpl;

public class ProfessionalServiceImpl extends BaseServiceImpl<Professional, Integer> implements ProfessionalService {

    private SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    private ProfessionalRepositoryImpl professionalRepository = new ProfessionalRepositoryImpl();

    @Override
    public Professional findByEmail(String email) {
        var session = sessionFactory.getCurrentSession();
        var transaction = session.getTransaction();
        transaction.begin();
        Professional professional = professionalRepository.findByEmail(email);
        transaction.commit();
        return professional;
    }
}

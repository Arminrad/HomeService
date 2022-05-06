package repository.impl;

import connection.SessionFactorySingleton;
import entities.Professional;
import org.hibernate.SessionFactory;
import repository.ProfessionalRepository;
import repository.base.impl.BaseRepositoryImpl;

public class ProfessionalRepositoryImpl extends BaseRepositoryImpl<Professional, Integer> implements ProfessionalRepository {
    private final SessionFactory sessionFactory = SessionFactorySingleton.getInstance();

    public Professional findByEmail(String email) {
        var session = sessionFactory.getCurrentSession();
        try {
            return session
                    .createQuery("select e from Professional e where e.email = :email", Professional.class)
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}

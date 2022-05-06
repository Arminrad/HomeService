package repository;

import entities.Professional;
import repository.base.BaseRepository;

public interface ProfessionalRepository extends BaseRepository<Professional, Integer> {

    Professional findByEmail(String email);
}

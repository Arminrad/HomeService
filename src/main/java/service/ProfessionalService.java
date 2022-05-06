package service;

import entities.Professional;
import service.base.BaseService;

public interface ProfessionalService extends BaseService<Professional, Integer> {

    Professional findByEmail(String email);
}

package service;

import entities.Customer;
import service.base.BaseService;

public interface CustomerService extends BaseService<Customer, Integer> {

    Customer findByEmail(String email);
}

package controller;

import entities.Service;
import service.impl.ServiceServiceImpl;
import service.impl.UserServiceImpl;

import java.util.List;

public class AdminController {
    private UserServiceImpl userService = new UserServiceImpl();
    private ServiceServiceImpl serviceService = new ServiceServiceImpl();


    public Service addNewService() {

    }

    public List<Service> showAllServicesWithCategoryId() {

    }
}

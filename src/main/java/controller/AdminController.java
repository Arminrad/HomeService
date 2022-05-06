package controller;

import entities.Service;
import entities.enumeration.UserStatus;
import entities.enumeration.UserType;
import service.impl.ServiceServiceImpl;
import service.impl.UserServiceImpl;

public class AdminController {
    private UserServiceImpl userService = new UserServiceImpl();
    private ServiceServiceImpl serviceService = new ServiceServiceImpl();
    private Utility utility = new Utility();

/*    public Service addNewService() {
        System.out.println("What is the service category id based on the list Below ");
        showAllServicesWithCategoryId();
        System.out.println("Enter service name: ");
        String serviceName = Gizmo.scanner.nextLine();
    }*/

    public void showAllServicesWithCategoryId() {
        System.out.println(serviceService.findAll(Service.class).toString());

    }
}

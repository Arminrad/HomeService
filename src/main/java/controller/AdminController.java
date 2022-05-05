package controller;

import entities.Professional;
import entities.Service;
import entities.enumeration.UserStatus;
import entities.enumeration.UserType;
import service.impl.ServiceServiceImpl;
import service.impl.UserServiceImpl;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class AdminController {
    private UserServiceImpl userService = new UserServiceImpl();
    private ServiceServiceImpl serviceService = new ServiceServiceImpl();
    private Utility utility = new Utility();

    public Professional professionalSignUp() {
        String firstName = utility.setFirstName();
        String lastName = utility.setLastName();
        String email = utility.setEmail();
        String password = utility.setPassword();
        Date signUpDate = new Date(System.currentTimeMillis());
        Double balance = 0.;
        UserStatus status = UserStatus.NEW;
        UserType type = UserType.Professional;
        String city = utility.setCityName();
        byte[] image = utility.setImage();
        String nationalCode = utility.setNationalCode();
        Set<Service> services = utility.setService();
        Professional professional = new Professional(firstName, lastName, email, password, balance, status, type, city, image, nationalCode, )
        return null;

    }



    public Service addNewService() {
        System.out.println("What is the service category id based on the list Below ");
        showAllServicesWithCategoryId();
        System.out.println("Enter service name: ");
        String serviceName = Gizmo.scanner.nextLine();
    }

    public void showAllServicesWithCategoryId() {
        System.out.println(serviceService.findAll(Service.class).toString());

    }
}

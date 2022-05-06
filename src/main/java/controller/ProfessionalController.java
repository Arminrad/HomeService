package controller;

import entities.Professional;
import entities.Service;
import entities.enumeration.UserStatus;
import entities.enumeration.UserType;

import java.util.Date;
import java.util.Set;

public class ProfessionalController {
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
        Professional professional = new Professional(firstName, lastName, email, password, signUpDate, balance, status, type, city, image, nationalCode, services);
        return professional;
    }
}

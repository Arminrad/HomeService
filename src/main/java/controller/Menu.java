package controller;

import static controller.Gizmo.scanner;

public class Menu {

    Utility utility = new Utility();
    ProfessionalController professionalController = new ProfessionalController();


    public void mainMenu() {
        System.out.println("^^^^^^^^^^--------------------********** Welcome to HomeService Company **********--------------------^^^^^^^^^^");
        System.out.println("1.SignIn \n" +
                "2.Professional SignUp \n" +
                "3.Customer SignUp \n" +
                "4.Service Order ");
        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                //signIn();
                break;
            case 2:
                professionalController.professionalSignUp();
                break;
            case 3:
                //customerSignUp();
                break;
            case 4:
                //serviceOrder();
                break;
        }
    }
}

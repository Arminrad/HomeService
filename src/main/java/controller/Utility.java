package controller;

import entities.Service;
import exception.*;
import service.impl.CustomerServiceImpl;
import service.impl.ProfessionalServiceImpl;
import service.impl.ServiceServiceImpl;

import java.sql.Timestamp;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Utility {
    private Scanner scanner = new Scanner(System.in);
    private String firstName,lastName, nationalCode,password,categoryName,
            email,cityName,superCategoryName,answer,description,address;
    private InvalidNameException invalidNameException = new InvalidNameException();
    private InvalidNationalCodeException invalidNationalId = new InvalidNationalCodeException();
    private InvalidPasswordException invalidPasswordException = new InvalidPasswordException();
    private CustomerServiceImpl customerService = new CustomerServiceImpl();
    private ProfessionalServiceImpl expertService = new ProfessionalServiceImpl();
    private ServiceServiceImpl serviceService = new ServiceServiceImpl();
    private Long id;
    private Integer credit;
    private Double price,bidPriceOrder,balance;



    public String setFirstName(){
        while(true){
            System.out.print("Enter first name:");
            try {
                firstName = scanner.nextLine();
                checkName(firstName);
                return firstName;
            }catch (InvalidNameException except){
                System.out.println(except.getMessage());
            }
        }
    }

    public String setLastName(){
        while(true){
            System.out.print("Enter last name:");
            try {
                lastName = scanner.nextLine();
                checkName(lastName);
                return lastName;
            }catch (InvalidNameException except){
                System.out.println(except.getMessage());
            }
        }
    }

    public String setCityName(){
        while(true){
            System.out.print("Enter city name :");
            try {
                cityName = scanner.nextLine();
                checkName(cityName);
                return cityName;
            }catch (InvalidNameException except){
                System.out.println(except.getMessage());
            }
        }
    }

    public String setServiceName(){
        while(true){
            System.out.print("Enter service name :");
            try {
                scanner.nextLine();
                cityName = scanner.nextLine();
                checkName(cityName);
                return cityName;
            }catch (InvalidNameException except){
                System.out.println(except.getMessage());
            }
        }
    }

    public String setSuperCategoryName(){
        while(true){
            System.out.print("Enter super category name :");
            try {
                superCategoryName = scanner.nextLine();
                checkName(superCategoryName);
                return superCategoryName;
            }catch (InvalidNameException except){
                System.out.println(except.getMessage());
            }
        }
    }

    public String setNationalCode(){
        while(true){
            System.out.print("Enter national code:");
            try {
                nationalCode = scanner.nextLine();
                nationalCodeChecker(nationalCode);
                return nationalCode;
            }catch (InvalidNationalCodeException except){
                System.out.println(except.getMessage());
            }
        }
    }

    public String setPassword(){
        while(true) {
            System.out.print("Enter your password:");
            try {
                password = scanner.nextLine();
                passwordCheck(password);
                return password;
            } catch (InvalidPasswordException except) {
                System.out.println(except.getMessage());
            }
        }
    }

    public String setCategoryName(){
        while(true){
            System.out.print("Enter category name:");
            try {
                categoryName = scanner.nextLine();
                checkName(categoryName);
                return categoryName;
            }catch (InvalidNameException except){
                System.out.println(except.getMessage());
            }
        }
    }

    public String setDescription(){
        while(true){
            System.out.print("Enter your description : ");
            try {
                description = scanner.nextLine();
                return description;
            }catch (InvalidNameException except){
                System.out.println(except.getMessage());
            }
        }
    }

    public String setAddress(){
        while(true){
            System.out.print("Enter address : ");
            try {
                address = scanner.nextLine();
                checkDescription(address);
                return address;
            }catch (InvalidNameException except){
                System.out.println(except.getMessage());
            }
        }
    }

    public void checkName(String name){
        if(name.length() < 3 )
            throw new InvalidNameException("name should be more than 2 character!");
        for (Character ch:name.toCharArray()) {
            if(Character.isDigit(ch))
                throw new InvalidNameException("name can not have number!");
        }
        for (Character ch:name.toCharArray()) {
            if(!Character.isAlphabetic(ch))
                throw new InvalidNameException("name can't have Sign(!,@,#,%,...)");
        }
    }

    public void checkDescription(String description){
        for (Character ch:description.toCharArray()) {
            if(!Character.isAlphabetic(ch))
                throw new InvalidNameException("Description can't have Sign(!,@,#,%,...)");

        }
    }

    public String checkAnswer(String answer){
        if(String.valueOf(answer).equals("true") || String.valueOf(answer).equals("false"))
            return answer;
        else System.out.println("Just enter true or false!!!");
        return null;
    }

    public void nationalCodeChecker(String nationalCode){
        if(nationalCode.length() > 10 )
            throw new InvalidNationalCodeException("national code can't more than ten number!");
        if(nationalCode.equals(""))
            throw new InvalidNationalCodeException("dont enter space!");
        for (Character ch:nationalCode.toCharArray()) {
            if(!Character.isDigit(ch))
                throw new InvalidNationalCodeException("national code should be just number!");
        }
    }

    public void idChecker(Long id){
        if(String.valueOf(id).length() > 3 )
            throw new InvalidNationalCodeException("ID length can not be more than three numbers!");
        for (Character ch:String.valueOf(id).toCharArray()) {
            if(!Character.isDigit(ch))
                throw new InvalidNationalCodeException("ID should be just number!");
        }
    }

    public void passwordCheck(String password){
        if(password.length() < 3 )
            throw new InvalidPasswordException("password should be more than 2 ");
        char[] passwordArray = password.toCharArray();
        char[] signArray =  new char[] {'!','@','#','$','%','^','&','*','(',')','-','+','=','.',',','>','<','?','/','|',':',';'};
        int lowerCase = 0,upperCase = 0,sign = 0,digit = 0;
        for(int i = 0;i<passwordArray.length;i++)
            if(Character.isUpperCase(passwordArray[i]))
                ++upperCase;
        for(int i = 0;i<passwordArray.length;i++)
            if(Character.isLowerCase(passwordArray[i]))
                ++lowerCase;
        for(int i = 0;i<passwordArray.length;i++)
            if(Character.isDigit(passwordArray[i]))
                ++digit;
        for(int i=0;i<signArray.length;i++)
            for(int j=0;j<passwordArray.length;j++)
                if(signArray[i] == passwordArray[j])
                    ++sign;
        if( (lowerCase == 0) || (upperCase == 0) || (sign == 0) || (digit == 0) )
            throw new InvalidPasswordException("Password should have lowerCase + upperCase + sign + digit!");
    }



    public Double setBalance(){
        while(true){
            System.out.print("Balance : ");
            while (true) {
                try {
                    balance = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } catch (Exception exception) {
                    scanner.nextLine();
                    System.out.print("Just number please : ");
                }
            }
            if(balance < 0 ){
                System.out.println("You must enter a price more than zero!");
            }else
                break;
        }
        return balance;
    }

    public Double setBasePrice(){
        while(true){
            System.out.print("Base price : ");
            while (true) {
                try {
                    balance = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } catch (Exception exception) {
                    scanner.nextLine();
                    System.out.print("Just number please : ");
                }
            }
            if(balance < 0 ){
                System.out.println("You must enter a price more than zero!");
            }else
                break;
        }
        return balance;
    }

    public Integer setCredit(){
        System.out.print("Credit : ");
        while (true) {
            try {
                credit = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (Exception exception) {
                scanner.nextLine();
                System.out.print("Just number please : ");
            }
        }
        return credit;
    }

    public String setEmail() {
        while (true) {
            String email = regexAdder("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$", "Email", "Example: alirezaVk@gmail.com");
            if (customerService.findByEmail(email) != null || expertService.findByEmail(email) != null) {
                System.out.println("Email address already exists!!!");
            } else return email;
        }
    }

    public String regexAdder(String regex, String tag, String additionalInfo) {
        while (true) {
            System.out.print(tag + "(" + additionalInfo + "): ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (Pattern.compile(regex).matcher(input).matches()) {
                return input;
            } else {
                System.out.println("Wrong Email Format!!!");
            }
        }
    }

    public String setAnswer(){
        while(true){
            System.out.print("Is this person approved by you?(Enter true or false) : ");
            try {
                answer = scanner.nextLine();
                checkAnswer(answer);
                break;
            }catch (InvalidBooleanException except){
                System.out.println(except.getMessage());
            }
        }
        return answer;
    }

    public Long setId(){
        while(true){
            System.out.print("Enter id : ");
            try {
                id = scanner.nextLong();
                scanner.nextLine();
                return id;
            }catch (InputMismatchException except){
                scanner.nextLine();
                System.out.println("You just have to enter the number");
            }
        }
    }

    public Timestamp orderExecutionDate(){
        while (true) {
            System.out.print("Enter execution date (like this -> 2022-10-02 18:48:00) : ");
            String text = scanner.nextLine();
            try {
                return Timestamp.valueOf(text);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String setImagePath(){
        while (true){
            System.out.println("Image path : ");
            try {
                String imagePath = scanner.nextLine();
                String[] returnedName = imagePath.split("//.");
                String format = returnedName[returnedName.length - 1];
                if (format.equals("png"))
                    return imagePath;
            } catch (Exception e) {
                throw new InvalidImageFormatException();
            }
        }
    }

    public Service serviceExistence(){
        while (true) {
            try {
                Long serviceId = setId();
                Service service = serviceService.findById(Service.class, serviceId);
                if (service != null){
                    return service;
                }
            } catch (Exception e) {
                System.out.println("This service doesn't exists!!!");
                break;
            }
        }
        return null;
    }

    public Double setBidPriceOrder(){
        while(true){
            System.out.print("Bid price order : ");
            while (true) {
                try {
                    bidPriceOrder = scanner.nextDouble();
                    scanner.nextLine();
                    break;
                } catch (Exception exception) {
                    scanner.nextLine();
                    System.out.print("Just number please : ");
                }
            }
            if(bidPriceOrder < 0 ){
                System.out.println("You must enter a price more than zero!");
            }else
                break;
        }
        return bidPriceOrder;
    }
}

package com.userregistration.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* @Description- user enter first name and last name using regex condition.
* first latter must be start with cap letter.
 */
public class UserValidator {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String emailId;
    private String mobileNumber;
    private String password;

    public String getFirstName() {
        System.out.println("enter your first name");
        firstName = scanner.nextLine();
        return firstName;
    }
    public String getLastName() {
        System.out.println("enter your last name");
        lastName = scanner.nextLine();
        return lastName;
    }
    public boolean validateFirstName(String name) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
        Matcher matcher = pattern.matcher(name);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("your name is valid");
        else
            System.out.println("invalid name");
        return matches;
    }
    /* @Description User enter a valid last name.
     */
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
        Matcher matcher = pattern.matcher(lastName);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("your name is valid");
        else
            System.out.println("invalid name");
        return matches;
    }
    /* @Description take a email id by user and return emailid.
     */
    public String getEmailId() {
        System.out.println("enter your email");
        emailId = scanner.next();
        return emailId;
    }
/*
   @Discription in this we are validate the condition for user.
   if user enter the currect email id and followed by the regex condition
 */
    public boolean validateEmail(String emailId) {
        scanner.nextLine();
        Pattern pattern = Pattern.compile(
                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(emailId);
        boolean matches = matcher.find();
        if(matches)
            System.out.println("Email id is valid");
        else
            System.out.println("Email id is not  valid");
        return matches;
    }
    /*
      user need to enter mobile number and must follow the condition.
     */
    public String getMobileNumber() {
        scanner.nextLine();
        System.out.println("enter your mobile number");
        mobileNumber = scanner.nextLine();
        return mobileNumber;
    }
    /* @Description
    this is the condition for user if the user follow the condition
    the valid mobile number other wise invalid mobile number.
     */
    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("^((\\+)?(\\d{2}[-]))?(\\d{10}){1}?$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("your mobile number is valid");
        else
            System.out.println("Invalid mobile number");

        return matches;
    }
    /*@Description:- take password from user
     */
    public String getPassword() {
        System.out.println("enter password");
        password = scanner.next();
        return password;
    }

    /*@Description:- password must be of length at least 8 characters or more
    * */
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile("[A-Z0-9a-z$%&*@!#]{8,}",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(password);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("your password is valid");
        else
            System.out.println("Invalid password");
        return matches;

    }

    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String firstName = userValidator.getFirstName();
        userValidator.validateFirstName(firstName);
        String lastName = userValidator.getLastName();
        userValidator.validateLastName(lastName);
        String emaiId = userValidator.getEmailId();
        userValidator.validateEmail(emaiId);
        String mobileNumber = userValidator.getMobileNumber();
        userValidator.validateMobileNumber(mobileNumber);
        String password = userValidator.getPassword();
        userValidator.validatePassword(password);


    }
}
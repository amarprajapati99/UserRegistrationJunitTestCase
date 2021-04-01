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
    private  String emailId;
    private String mobileNumber;

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
    public void validateName(String name) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
        Matcher matcher = pattern.matcher(name);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("your name is valid");
        else
            System.out.println("invalid name");
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
    /*
    this is the condition for user if the user follow the condition
    the valid mobile number other wise invalid mobile number.
     */
    public void validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("^((\\+)?(\\d{2}[-]))?(\\d{10}){1}?$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean matches = matcher.find();
        if (matches)
            System.out.println("your mobile number is valid");
        else
            System.out.println("Invalid mobile number");

    }

    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String firstName = userValidator.getFirstName();
        userValidator.validateName(firstName);
        String lastName = userValidator.getLastName();
        userValidator.validateName(lastName);
        String emaiId = userValidator.getEmailId();
        userValidator.validateEmail(emaiId);
        String mobileNumber = userValidator.getMobileNumber();
        userValidator.validateMobileNumber(mobileNumber);

    }
}
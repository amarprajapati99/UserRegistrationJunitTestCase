package com.userregistration.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* @Description- user enter first name and last name using regex condition.
* first latter must be start with cap letter.
* Added mobile number with country code.*/
public class UserValidator {
    Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String emailId;
    private String mobileNumber;
    private String password;
    Pattern namePattern = Pattern.compile("^[A-Z][a-z]{2,}$");
    Pattern emailPattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]{2,6}){0,1}(\\.[A-Za-z]{2,3})$", Pattern.CASE_INSENSITIVE);
    Pattern mobileNumberPattern = Pattern.compile("^[91]+[\\s]+[1-9]{1}+[0-9]{9}$", Pattern.CASE_INSENSITIVE);
    Pattern passwordPattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])((?=.+[!$%^&*(),.:@#^]){1}).{8,}$");


    public String getFirstName() {
        System.out.println("enter your first name");
        firstName = scanner.nextLine();
        return firstName;
    }

    public boolean validateName(String firstName) throws InvalidUserDetails {
        try {
            checkInputIsEmpty(firstName);
            checkNameIsInDigits(firstName);
            Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
            Matcher matcher = pattern.matcher(firstName);
            boolean matches = matcher.find();
            return matches;
        } catch (NullPointerException e) {
            throw new InvalidUserDetails(
                    InvalidUserDetails.ExceptionType.enterNull, "Please enter a valid input");
        }
    }

    private void checkNameIsInDigits(String firstName) throws InvalidUserDetails {
        if (firstName.matches("[0-9]+")) {
            throw new InvalidUserDetails(
                    InvalidUserDetails.ExceptionType.enterDigit, "Please enter alphabets");
        }
    }



    public String getLastName() {
        System.out.println("enter your last name");
        lastName = scanner.nextLine();
        return lastName;
    }

    /* @Description User enter a valid last name.
     */
    public boolean validateLName(String lastName) {
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
    public boolean validateEmail(String emailId) throws InvalidUserDetails {
        try {
            checkInputIsEmpty(emailId);
            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]{2,6}){0,1}(\\.[A-Za-z]{2,3})$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(emailId);
            boolean matches = matcher.find();
            return matches;
        } catch (NullPointerException e) {
            throw new InvalidUserDetails(
                    InvalidUserDetails.ExceptionType.enterNull, "Please enter a valid email");
        }
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
    public boolean validateNumber(String mobileNumber) throws InvalidUserDetails {
        try {
            checkInputIsEmpty(mobileNumber);
            checkMobileNumberIsInLetters(mobileNumber);
            Pattern pattern = Pattern.compile("^[91]+[\\s]+[1-9]{1}+[0-9]{9}$", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(mobileNumber);
            boolean matches = matcher.find();
            return matches;
        } catch (NullPointerException e) {
            throw new InvalidUserDetails(
                    InvalidUserDetails.ExceptionType.enterNull, "Please enter a valid mobile number");
        }
    }

    private void checkMobileNumberIsInLetters(String mobileNumber) throws InvalidUserDetails {
        if (mobileNumber.matches("[A-Za-z]+")) {
            throw new InvalidUserDetails(
                    InvalidUserDetails.ExceptionType.enterChar, "Please enter digits");
        }
    }

    /*@Description:- take password from user
     */
    public String getPassword() {
        System.out.println("enter password");
        password = scanner.next();
        return password;
    }

    /*@Description:- password must be of length at least 8 characters or more.
    password contain at least one upper case.
    passeord conitan atleast one numeric number.
    * */
    public boolean validatePass(String password) throws  InvalidUserDetails{

        try {
            checkInputIsEmpty(password);
            Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])((?=.+[!$%^&*(),.:@#^]){1}).{8,}$");
            Matcher matcher = pattern.matcher(password);
            boolean matches = matcher.find();
            return matches;
        } catch (NullPointerException e) {
            throw new InvalidUserDetails(
                    InvalidUserDetails.ExceptionType.enterNull, "Please enter a valid password");
        }
    }

    private void checkInputIsEmpty(String input ) throws InvalidUserDetails {
        if (input.length() == 0) {
            throw new InvalidUserDetails(
                    InvalidUserDetails.ExceptionType.enterEmpty, "Please give some input");
        }
    }


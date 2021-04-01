package com.userregistration.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* @Description- user enter first name and last name using regex condition.
* first latter must be start with cap letter.
 */
public class UserValidator {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first name");
        firstName = scanner.nextLine();
        return firstName;
    }

    public boolean validateName(String name) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
        Matcher matcher = pattern.matcher(name);
        boolean matches = matcher.find();
                return matches;
    }
    /* @Description User enter a valid last name.
     */
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
        Matcher matcher = pattern.matcher(lastName);
        boolean matches = matcher.find();
        return matches;
    }
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String firstName = userValidator.getFirstName();
        userValidator.validateName(firstName);
    }

}
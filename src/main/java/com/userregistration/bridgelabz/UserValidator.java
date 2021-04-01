package com.userregistration.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    private String firstName;

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

    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        String firstName = userValidator.getFirstName();
        userValidator.validateName(firstName);
    }

}
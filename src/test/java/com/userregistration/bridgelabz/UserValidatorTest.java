package com.userregistration.bridgelabz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    UserValidator userValidatorTest = new UserValidator();

    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.validateName("Jay");
        Assert.assertEquals(true,result);}

    @org.junit.jupiter.api.Test
    public void givenFirstName_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.validateName("jay");
        Assert.assertEquals(false,result);}
    @org.junit.jupiter.api.Test

    public void givenFirstName_whenProperShouldReturnFalse() {
        boolean result = userValidatorTest.validateName("Jo");
        Assert.assertEquals(false,result);}
    @org.junit.jupiter.api.Test

    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.validateLName("Jay");
        Assert.assertEquals(true,result);}
    @org.junit.jupiter.api.Test

    public void givenLastName_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.validateLName("jay");
        Assert.assertEquals(false,result);}
    @org.junit.jupiter.api.Test

    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.validateNumber("+91 1235468844");
        Assert.assertEquals(true, result);}
    @org.junit.jupiter.api.Test

    public void givenMobileNumber_whenProper_shouldReturnFalse() {
        boolean result = userValidatorTest.validateNumber("+91-1235468844");
        Assert.assertEquals(false, result);}
    @org.junit.jupiter.api.Test

    public void givenPassword_whenProper_shouldReturnTrue() {
        boolean result = userValidatorTest.validatePass("Ja@xyzzss1");
        Assert.assertEquals(true, result);}
    @org.junit.jupiter.api.Test

    public void givenEmailId_ValidShould_ReturnTrue() {
        boolean result = userValidatorTest.validateEmail("abc100@gmail.com.");
        Assert.assertEquals(true, result);
    }
    @org.junit.jupiter.api.Test
    public void givenEmailId_ValidShould_ReturnFalse() {
        boolean result = userValidatorTest.validateEmail("abc-100.@.gmail.com");
        Assert.assertEquals(false, result);
    }

}


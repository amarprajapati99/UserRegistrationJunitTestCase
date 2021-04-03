package com.userregistration.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    UserValidator userValidator = new UserValidator();


    @Test
    public void givenFirst_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateFirstName("Jay");
        Assert.assertEquals(true,result);

    }

    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateLastName("Praj");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmailId_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateEmail("xyz@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validateMobileNumber("+91-5842484762");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenPassword_whenProper_shouldReturnTrue() {
        boolean result = userValidator.validatePassword("amxsserf");
        Assert.assertEquals(true,result);
    }

}

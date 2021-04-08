package com.userregistration.bridgelabz;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
@RunWith(Parameterized.class)
    public class EmailValidationTest {
    private String email;
    private boolean expectedResult;
    private UserValidator registerdEmail;
    public EmailValidationTest(boolean expected, String email) {
       super();
       this.email = email;
       this.expectedResult = expected;
    }
    @Before
    public void initialize() {
    registerdEmail = new UserValidator();
    }
 @Parameterized.Parameters
        public static Collection input() {
            return Arrays.asList(new Object[][]{
               {true, "abc@yahoo.com"},
               {true, "abc-100@yahoo.com"},
               {true, "abc.100@yahoo.com"},
               {true, "abc111@abc.com"},
               {true, "abc-100@abc.net"},
               {true, "abc.100@abc.com.au"},
               {true, "abc@1.com"},
            });
  }
  @Test
      public void testEmailValidation() {
          System.out.println("expected result for email is " + expectedResult);
          Assert.assertEquals(expectedResult, registerdEmail.validateEmail(email));

    }
}


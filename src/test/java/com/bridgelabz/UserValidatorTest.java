package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    /**
     * use case 1 test cases for first name
     */
    //when the name starts with a capital letter
    @Test
    public void givenFirstName_ShouldReturn_True() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Mangesh");
        System.out.println(result);
        Assert.assertTrue(result);
    }

    //when a name starts with a small letter
    @Test
    public void givenFirstName_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("mangesh");
        Assert.assertFalse(result);
    }

    //when a name has 3 or more letters
    @Test
    public void givenFirstName_MinimumThreeLetters_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Man");
        Assert.assertTrue(result);
    }

    //when a name does not contain 3 minimum letters
    @Test
    public void givenFirstName_NotHaveMinimumThreeLetters_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Ma");
        Assert.assertFalse(result);
    }
}
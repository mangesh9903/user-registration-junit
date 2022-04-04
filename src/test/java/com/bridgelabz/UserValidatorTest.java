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

    /**
     * use case 2 test cases for last name
     */
    //when the name starts with a capital letter
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Bhujang");
        Assert.assertTrue(result);
    }

    //when a name starts with a small letter
    @Test
    public void givenLastName_WhenLastNameNotStartsWithCapitalLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("bhujang");
        Assert.assertFalse(result);
    }

    //when a name has 3 or more letters
    @Test
    public void givenLastName_WhenLastNameHaveMinimumThreeLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Bhu");
        Assert.assertTrue(result);
    }

    //when a name does not contain minimum 3 letters
    @Test
    public void givenLastName_WhenLastNameNotHaveMinimumThreeLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Bh");
        Assert.assertFalse(result);
    }

    /**
     * use case 3 test cases for Email Address.
     */
    // Given Email When Email Starts With Small Letter ShouldReturn True
    @Test
    public void givenEmail_WhenEmailStartsWithSmallLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("mangeshb9903@gmail.com");
        Assert.assertTrue(result);
    }

    // Given Email When Email Ends With Com Should Return True
    @Test
    public void givenEmail_WhenEmailEndsWithCom_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("mangesh@gmail.com");
        Assert.assertEquals(true, result);
    }

    // Given Email When Email Ends With In Should Return True
    @Test
    public void givenEmail_WhenEmailEndsWithIn_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("mangesh@gmail.co.in");
        Assert.assertEquals(true, result);
    }

    // Given Email When Email Not Ends With Com Or In Should Return False
    @Test
    public void givenEmail_WhenEmailNotEndsWithComOrIn_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("Abc@gmail.sdf.errt");
        Assert.assertEquals(false, result);
    }
}
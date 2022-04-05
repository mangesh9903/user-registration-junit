package com.bridgelabz;

import com.bridgelabz.customexception.InvalidUserException;
import com.bridgelabz.serviceimpl.UserValidator;
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
    public void givenFirstName_NotHaveMinimumThreeLetters_ShouldReturn_False() throws InvalidUserException {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Ma");
        Assert.assertFalse(result);
    }

    /*
     */

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
        Assert.assertTrue(result);
    }

    // Given Email When Email Ends With In Should Return True
    @Test
    public void givenEmail_WhenEmailEndsWithIn_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("mangeshb9903@gmail.co.in");
        Assert.assertTrue(result);
    }

    // Given Email When Email Not Ends With Com Or In Should Return False
    @Test
    public void givenEmail_WhenEmailNotEndsWithComOrIn_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("abc@gmail.sdf.errt");
        Assert.assertFalse(result);
    }

    // Given Email When Email Not Ends With Com Or In Should Return False
    @Test
    public void givenEmail_WhenEmailStartWithCapitalLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateEmail("Abc@gmail.com");
        Assert.assertFalse(result);
    }

    /**
     * Use case 4 Test cases for Mobile Number
     */
    // Given Mobile Number When Mobile Number Is Followed By Country Code True
    @Test
    public void givenMobileNumber_WhenMobileNumberIsFollowedByCountryCode_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91-7620263999");
        Assert.assertTrue(result);
    }

    // Given Mobile Number When Mobile Number Is Not Followed By Country Code Should Return False
    @Test
    public void givenMobileNumber_WhenMobileNumberIsNotFollowedByCountryCode_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("7620263999");
        Assert.assertFalse(result);
    }

    // Given Phone Number When Phone Number Is Ten Digit True
    @Test
    public void givenMobileNumber_WhenMobileNumberIsTenDigit_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91-7620263999");
        Assert.assertTrue(result);
    }

    // Given Phone Number When Phone Number Is Not Ten Digit Should Return False
    @Test
    public void givenMobileNumber_WhenMobileNumberIsNotTenDigit_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateMobileNumber("91-762026");
        Assert.assertFalse(result);
    }

    /**
     * use case 5 test cases for password
     */
    // Given Password When Password Is Minimum Eight Digit Should Return True
    @Test
    public void givenPassword_WhenPasswordIsMinimumEightDigit_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Bhujang234$");
        Assert.assertTrue(result);
    }

    // Given Password When Password Is Not Minimum Eight Digit Should Return False
    @Test
    public void givenPassword_WhenPasswordIsNotMinimumEightDigit_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("mang");
        Assert.assertFalse(result);
    }

    // Given Password When Password Have At least One Capital Letter Should Return True
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneCapitalLetter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Mangesh234$");
        Assert.assertTrue(result);
    }

    // Given Password When Password Not Have At least One Capital Letter Should Return False
    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneCapitalLetter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("mangesh@");
        Assert.assertFalse(result);
    }

    // Given Password When Password Have At least One Speacial Character Should Return True
    @Test
    public void givenPassword_WhenPasswordHaveAtleastOneSpeacialCharacter_ShouldReturn_True() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Mangesh123$");
        Assert.assertTrue(result);
    }

    // Given Password When Password Not Have At least One Speacial Character Should Return False
    @Test
    public void givenPassword_WhenPasswordNotHaveAtleastOneSpeacialCharacter_ShouldReturn_False() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Mangesh1234");
        Assert.assertFalse(result);
    }

}
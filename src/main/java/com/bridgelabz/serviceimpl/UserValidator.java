package com.bridgelabz.serviceimpl;

import com.bridgelabz.customexception.InvalidUserException;
import com.bridgelabz.service.UserRegistrationFI;
import com.bridgelabz.service.UserValidatorI;

import java.util.regex.Pattern;

/*********************************************************************
 * Purpose: Class is implemented for Regex Validtion and Testing using Junit test cases.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 31-03-2022
 *
 **********************************************************************/

public class UserValidator implements UserValidatorI {
    final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private final String EMAIL_PATTERN = "^[a-z0-9]{1,}[.]{0,1}[a-zA-Z0-9]{0,}+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.]{0,1}[a-zA-Z]{0,2}$";
    private final String MOBILE_NO_PATTERN = "^[0-9]{0,2}[-][0-9]{10}";
    private final String PASSWORD_PATTERRN = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@\\-#$%^&+=])" + "(?=\\S+$).{8,}$";

    /**
     * @param firstName Input from the user
     * @return It will Check Input and Field Pattern  and Give result.
     */
    public boolean validateFirstName(String firstName) {
        UserRegistrationFI userRegistrationIFun = (namePattern, input) -> Pattern.matches(NAME_PATTERN, input);
        boolean result = userRegistrationIFun.validate(NAME_PATTERN, firstName);
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserException("Invalid First Name, Please Enter Valid First Name.");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    /**
     * @param lastName Input from the user
     * @return It will Check Input and Field Pattern and Give result.
     */
    public boolean validateLastName(String lastName) {
        UserRegistrationFI userRegistrationIFun = (namePattern, input) -> Pattern.matches(NAME_PATTERN, input);
        boolean result = userRegistrationIFun.validate(NAME_PATTERN, lastName);
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserException("Invalid Last Name, Please Enter Valid Last Name.");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    /**
     * @param email Input from the user
     * @return It will Check Input and Field Pattern and Give result.
     */
    @Override
    public boolean validateEmail(String email) {
        UserRegistrationFI userRegistrationIFun = (emailPattern, input) -> Pattern.matches(EMAIL_PATTERN, input);
        boolean result = userRegistrationIFun.validate(EMAIL_PATTERN, email);
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserException("Invalid Email Address, Please Enter Valid Email Address.");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    /**
     * @param mobileNumber from the user
     * @return It will Check Input and Field Pattern and Give result.
     */
    @Override
    public boolean validateMobileNumber(String mobileNumber) {
        UserRegistrationFI userRegistrationIFun = (mobileNoPattern, input) -> Pattern.matches(MOBILE_NO_PATTERN, input);
        boolean result = userRegistrationIFun.validate(MOBILE_NO_PATTERN, mobileNumber);
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserException("Invalid Mobile Number, Please Enter Valid Mobile Number.");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    /**
     * @param password from the user
     * @return It will Check Input and Field Pattern and Give result.
     */
    @Override
    public boolean validatePassword(String password) {
        UserRegistrationFI userRegistrationIFun = (passwordPattern, input) -> Pattern.matches(PASSWORD_PATTERRN, input);
        boolean result = userRegistrationIFun.validate(PASSWORD_PATTERRN, password);
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserException("Invalid Password, Please Enter Valid Password.");
            }
        } catch (InvalidUserException e) {
            System.out.println(e.getMessage());
        }
        return result;

    }
}

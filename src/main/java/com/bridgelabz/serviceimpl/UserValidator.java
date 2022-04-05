package com.bridgelabz.serviceimpl;

import com.bridgelabz.customexception.InvalidUserException;
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

        Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean result = pattern.matcher(firstName).matches();
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
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        boolean result = pattern.matcher(lastName).matches();
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
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        boolean result = pattern.matcher(email).matches();
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
    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NO_PATTERN);
        boolean result = pattern.matcher(mobileNumber).matches();
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
    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERRN);
        boolean result = pattern.matcher(password).matches();
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

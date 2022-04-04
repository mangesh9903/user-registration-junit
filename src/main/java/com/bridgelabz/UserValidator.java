package com.bridgelabz;

import java.util.regex.Pattern;

/*********************************************************************
 * Purpose: Class is implemented for Regex Validtion and Testing using Junit test cases.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 31-03-2022
 *
 **********************************************************************/

public class UserValidator {
    private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private final String EMAIL_PATTERN = "^[a-zA-Z0-9]{1,}[.]{0,1}[a-zA-Z0-9]{0,}+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.]{0,1}[a-zA-Z]{0,2}$";
    private final String MOBILE_NO_PATTERN = "^[0-9]{0,2}[-][0-9]{10}";

    /**
     * @param firstName Input from the user
     * @return It will Check Input and Field Pattern  and Give result.
     */
    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    /**
     * @param lastName Input from the user
     * @return It will Check Input and Field Pattern and Give result.
     */
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    /**
     * @param email Input from the user
     * @return It will Check Input and Field Pattern and Give result.
     */
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(email).matches();
    }

    /**
     * @param mobileNumber from the user
     * @return It will Check Input and Field Pattern and Give result.
     */
    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NO_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }
}

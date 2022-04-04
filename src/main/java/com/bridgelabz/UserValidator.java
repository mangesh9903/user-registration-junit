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

    /**
     * @param firstName Input from the user
     * @return It will Check Input and Field Pattern  and Give result.
     */
    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}

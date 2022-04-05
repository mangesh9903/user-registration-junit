package com.bridgelabz.service;
/*********************************************************************
 * Purpose: Interface  for User Validation.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 02-03-2022
 *
 **********************************************************************/
public interface UserValidatorI {
    boolean validateFirstName(String firstName);

    boolean validateLastName(String lastName);

    boolean validateEmail(String email);

    boolean validateMobileNumber(String mobileNumber);

    boolean validatePassword(String password);
}

package com.bridgelabz.service;

/*********************************************************************
 * Purpose: Functional Interface.
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 05-03-2022
 *
 **********************************************************************/
@FunctionalInterface
public interface UserRegistrationFI {
    boolean validate(String Pattern, String name);
}

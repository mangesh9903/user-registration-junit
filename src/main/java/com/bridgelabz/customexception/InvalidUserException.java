package com.bridgelabz.customexception;
/*********************************************************************
 * Purpose: Class for Custom Exception .
 *
 * @author Mangesh Bhujang
 * @version 1.0
 * @since 02-03-2022
 *
 **********************************************************************/
public class InvalidUserException extends Exception {

    public InvalidUserException(String message) {
        super(message);
    }
}

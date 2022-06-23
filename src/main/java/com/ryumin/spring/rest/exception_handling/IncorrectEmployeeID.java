package com.ryumin.spring.rest.exception_handling;

public class IncorrectEmployeeID extends RuntimeException {
    public IncorrectEmployeeID(String message) {
        super(message);
    }
}

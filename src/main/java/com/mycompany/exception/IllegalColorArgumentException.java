package com.mycompany.exception;

public class IllegalColorArgumentException extends RuntimeException {
    public IllegalColorArgumentException(String message) {
        super(message);
    }
}

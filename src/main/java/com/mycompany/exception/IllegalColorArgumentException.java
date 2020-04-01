package com.mycompany.exception;

public class IllegalColorArgumentException extends RuntimeException {
    public IllegalColorArgumentException(Throwable cause) {
        super(cause);
    }

    public IllegalColorArgumentException(String message) {
        super(message);
    }
}

package com.userregistration.bridgelabz;

public class InvalidUserDetails extends  Exception {
    public enum ExceptionType {
        enterNull,
        enterEmpty,
        enterDigit,
        enterChar,
    }

    public ExceptionType type;

    public InvalidUserDetails(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}

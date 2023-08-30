package com.deliveroo;

public class InvalidCronFieldException extends Throwable {
    public InvalidCronFieldException(String message) {
        super(message);
    }
}

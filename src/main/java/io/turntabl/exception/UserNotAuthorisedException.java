package io.turntabl.exception;

public class UserNotAuthorisedException extends Exception{
    public UserNotAuthorisedException(String message) {
        super(message);
    }
}

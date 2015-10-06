package se.patrikbergman.java.designpattern.unknown.executor.service.api.exception;

public class InvalidCardException extends AccountException {

    public InvalidCardException() {
        super("Invalid card exception");
    }
}

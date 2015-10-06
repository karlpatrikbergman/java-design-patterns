package se.patrikbergman.java.designpattern.unknown.executor.service.api.exception;

public class WrongPinException extends AccountException {
    public WrongPinException() {
        super("Wrong pin exception");
    }
}

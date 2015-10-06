package se.patrikbergman.java.designpattern.unknown.executor.service.api.exception;

public class TechnicalErrorException extends AccountException {
    public TechnicalErrorException() {
        super("Technical error exception");
    }
}

package se.patrikbergman.java.designpattern.unknown.executor.service.api.exception;

public class CardExpiredException extends AccountException {
    public CardExpiredException() {
        super("Card expired exception");
    }
}

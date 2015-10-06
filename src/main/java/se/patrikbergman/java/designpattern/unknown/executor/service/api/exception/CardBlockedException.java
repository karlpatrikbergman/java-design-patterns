package se.patrikbergman.java.designpattern.unknown.executor.service.api.exception;

public class CardBlockedException extends AccountException {

    public CardBlockedException() {
        super("Card blocked exception");
    }
}

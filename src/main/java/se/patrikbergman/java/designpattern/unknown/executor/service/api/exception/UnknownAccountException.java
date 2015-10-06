package se.patrikbergman.java.designpattern.unknown.executor.service.api.exception;

public class UnknownAccountException extends AccountException {
    public UnknownAccountException() {
        super("Unknown Account exception");
    }
}

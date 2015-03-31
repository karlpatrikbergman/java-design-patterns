package se.patrikbergman.java.designpattern.unknown.executor.client;

class AccountExecuteException extends Exception {
	private final String errorCode;

	public AccountExecuteException(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}

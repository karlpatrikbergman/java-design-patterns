package se.patrikbergman.java.designpattern.unknown.executor.client;

import se.patrikbergman.java.designpattern.unknown.executor.service.api.Account;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.AccountException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.CardBlockedException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.CardExpiredException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.InvalidCardException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.TechnicalErrorException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.UnknownAccountException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.WrongPinException;

@SuppressWarnings("FieldCanBeLocal")
abstract class AccountExecutor {
	@SuppressWarnings({"unused", "FieldCanBeLocal"})
	private Account account;

	public AccountExecutor(Account account) {
		this.account = account;
	}

	public void execute() throws AccountExecuteException {
		try {
			invokeMethod();
		} catch (CardBlockedException e) {
			throw new AccountExecuteException("CARD_BLOCKED");
		} catch (CardExpiredException e) {
			throw new AccountExecuteException("CARD_EXPIRED");
		} catch (InvalidCardException e) {
			throw new AccountExecuteException("INVALID_CARD");
		} catch (TechnicalErrorException e) {
			throw new AccountExecuteException("TECHNICAL_ERROR");
		} catch (UnknownAccountException e) {
			throw new AccountExecuteException("UNKNOWN_ACCOUNT");
		} catch (WrongPinException e) {
			throw new AccountExecuteException("WRONG_PIN");
		} catch (AccountException e) {
			throw new AccountExecuteException("UNKNOWN_ERROR");
		}
	}

	public abstract void invokeMethod() throws AccountException;
}

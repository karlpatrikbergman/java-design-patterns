package se.patrikbergman.java.designpattern.unknown.executor.service;

import org.junit.Test;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.Account;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.AccountException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.CardBlockedException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.CardExpiredException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.InvalidCardException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.TechnicalErrorException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.UknownAccountException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.WrongPinException;

public class AccountTest {
	private final Account account = new AccountService();

	@Test
	public void foo() {
		try {
			account.deposit();

		} catch (CardBlockedException e) {
			System.err.println(e.getClass().getSimpleName());

		} catch (CardExpiredException e) {
			System.err.println(e.getClass().getSimpleName());

		} catch (InvalidCardException e) {
			System.err.println(e.getClass().getSimpleName());

		} catch (TechnicalErrorException e) {
			System.err.println(e.getClass().getSimpleName());

		} catch (UknownAccountException e) {
			System.err.println(e.getClass().getSimpleName());

		} catch (WrongPinException e) {
			System.err.println(e.getClass().getSimpleName());

		} catch (AccountException e) {
			e.printStackTrace();
		}
	}
}

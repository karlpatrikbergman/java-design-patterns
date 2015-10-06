package se.patrikbergman.java.designpattern.unknown.executor.service;

import org.junit.Test;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.Account;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.AccountException;

public class AccountTest {
	private final Account account = new AccountService();

	@Test
	public void deposit() {
		try {
			account.deposit();
		} catch (AccountException e) {
			System.err.println(e.getMessage());
		}
	}
}

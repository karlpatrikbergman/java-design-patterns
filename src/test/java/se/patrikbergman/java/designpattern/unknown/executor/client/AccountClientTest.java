package se.patrikbergman.java.designpattern.unknown.executor.client;

import org.junit.Test;
import se.patrikbergman.java.designpattern.unknown.executor.service.AccountService;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.Account;

/**
 * AccountClient uses Account. Account methods throws various exceptions. AccountClient
 * prints a certain error code depending on which exception that was thrown.
 */

public class AccountClientTest {
	private final Account account = new AccountService();
	private final AccountClient accountClient = new AccountClient(account);

	@Test
	public void withdraw() {
		accountClient.withdraw();
	}

	@Test
	public void purchase() {
		accountClient.purchase();
	}

	@Test
	public void deposit() {
		accountClient.deposit();
	}

	@Test
	public void returnOfGoods() {
		accountClient.returnOfGoods();
	}

	@Test
	public void reverse() {
		accountClient.reverse();
	}
}

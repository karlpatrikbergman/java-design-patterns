package se.patrikbergman.java.designpattern.unknown.executor.client;

import se.patrikbergman.java.designpattern.unknown.executor.service.api.Account;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.AccountException;

/**
 * Goal:
 * We need to be able to execute all Accounts methods, and take certain actions depending on the Exception that is
 * thrown. We don't want to repeat catch clauses in every method (withdraw, purchase, deposit etc)
 *
 * Solution:
 * Put exception handling/mapping in abstract class AccountExecutor. Create anonymous classes that implements
 * AbstractExecutor.
 *
 * In a real world example AccountClient would probably do more than just delegate to Account.
 *
 */

class AccountClient {
	private final Account account;

	public AccountClient(final Account account) {
		this.account = account;
	}

	public void withdraw() {
		final AccountExecutor invoker = new AccountExecutor(account) {
			@Override
			public void invokeMethod() throws AccountException {
				account.withdraw();
			}
		};
		execute(invoker);
	}

	public void purchase() {
		final AccountExecutor invoker = new AccountExecutor(account) {
			@Override
			public void invokeMethod() throws AccountException {
				account.purchase();
			}
		};
		execute(invoker);
	}

	public void deposit() {
		final AccountExecutor invoker = new AccountExecutor(account) {
			@Override
			public void invokeMethod() throws AccountException {
				account.deposit();
			}
		};
		execute(invoker);
	}

	public void returnOfGoods() {
		final AccountExecutor invoker = new AccountExecutor(account) {
			@Override
			public void invokeMethod() throws AccountException {
				account.returnOfGoods();
			}
		};
		execute(invoker);
	}

	public void reverse() {
		final AccountExecutor invoker = new AccountExecutor(account) {
			@Override
			public void invokeMethod() throws AccountException {
				account.reverse();
			}
		};
		execute(invoker);
	}


	private void execute(final AccountExecutor accountExecutor) {
		try {
			accountExecutor.execute();
		} catch (AccountExecuteException e) {
			System.err.println(e.getErrorCode());
		}
	}


}

package se.patrikbergman.java.designpattern.unknown.executor.service;

import org.apache.commons.lang3.RandomUtils;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.Account;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.AccountException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.CardBlockedException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.CardExpiredException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.InvalidCardException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.TechnicalErrorException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.UnknownAccountException;
import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.WrongPinException;

public class AccountService implements Account {

	@Override
	public void withdraw() throws AccountException {
		throwRandomException();
	}

	@Override
	public void purchase() throws AccountException {
		throwRandomException();
	}

	@Override
	public void deposit() throws AccountException {
		throwRandomException();
	}

	@Override
	public void returnOfGoods() throws AccountException {
		throwRandomException();
	}

	@Override
	public void reverse() throws AccountException {
		throwRandomException();
	}

	private void throwRandomException() throws AccountException {
		final int i = RandomUtils.nextInt(1,7);
		switch (i) {
			case 1:
				throw new InvalidCardException();
			case 2:
				throw new CardExpiredException();
			case 3:
				throw new WrongPinException();
			case 4:
				throw new CardBlockedException();
			case 5:
				throw new TechnicalErrorException();
			case 6:
				throw new UnknownAccountException();
			default:
				throw new AccountException("General Account Exception");
		}

		//InvalidCard, CardExpired, WrongPin, CardBlocked, TechnicalError, UnknownAccount
	}
}

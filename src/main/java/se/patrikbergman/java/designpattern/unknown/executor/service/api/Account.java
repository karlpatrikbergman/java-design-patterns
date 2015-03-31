package se.patrikbergman.java.designpattern.unknown.executor.service.api;

import se.patrikbergman.java.designpattern.unknown.executor.service.api.exception.AccountException;

public interface Account {
	void withdraw() throws AccountException;
	void purchase() throws AccountException;
	void deposit() throws AccountException;
	void returnOfGoods() throws AccountException;
	void reverse() throws AccountException;
}

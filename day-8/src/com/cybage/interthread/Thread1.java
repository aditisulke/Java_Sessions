package com.cybage.interthread;

public class Thread1 extends Thread{
	private Account account;
	
	public Thread1(Account account) {
		this.account = account;
	}
	@Override
	public void run() {
		account.withdraw(40000);
	}
	
}

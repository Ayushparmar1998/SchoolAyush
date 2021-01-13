package com.raystec.testaccount;

import com.raystec.account.Account;

public class TestAccount {

	public static void main(String[] args) {
		Account a = new Account();
		a.setAccountBalance(56000.2356);
		a.setAccountNumber(15003200);
		a.setAccountType("saving");
		a.setFundTransfer(25000);
		a.setPayBill(562.000);
		a.setWithdrawl(2300560);
		double d = a.getAccountBalance();
		int i = a.getAccountNumber();
		String s = a.getAccountType();
		double d2 = a.getFundTransfer();
		double d1 = a.getPayBill();
		int i1 = a.getWithdrawl();
		System.out.println(d);
		System.out.println(i);
		System.out.println(s);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(i1);
 }

}

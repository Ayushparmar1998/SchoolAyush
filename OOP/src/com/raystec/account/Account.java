package com.raystec.account;

public class Account {

	private String accountType = null;
	private int accountNumber = 0;
	private double accountBalance = 0;
	private double fundTransfer = 0;
	private int withdrawl = 0;
	private double payBill = 0;
	
	
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getFundTransfer() {
		return fundTransfer;
	}
	public void setFundTransfer(double fundTransfer) {
		this.fundTransfer = fundTransfer;
	}
	public int getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(int withdrawl) {
		this.withdrawl = withdrawl;
	  }
	public double getPayBill() {
		return payBill;
	   }
	public void setPayBill(double payBill) {
		this.payBill = payBill;
	}
	
}



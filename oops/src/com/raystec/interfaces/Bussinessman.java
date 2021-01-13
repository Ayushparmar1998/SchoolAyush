package com.raystec.interfaces;

public class Bussinessman implements Richman, SocialWorker {
	public void helpToOther() {
		System.out.println("Helptoother");
	}

	public void earnMoney() {
		System.out.println("EarnMoney");
	}

	public void party() {
		System.out.println("Party");
	}

	public String donation() {
		System.out.println("Donation");
		return null;
	}

	public static void main(String[] args) {
		Bussinessman b = new Bussinessman();
		          b.donation();
	}

}

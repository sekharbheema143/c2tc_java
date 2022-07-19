package com.cg.framework;

public abstract class SavingAcc extends BankAcc {
	private static final float minbal = 100;
	private boolean isSalary;
	
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}
	public void withdraw(float accBal) {
		System.out.println("Your balance is = + accBal");
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}

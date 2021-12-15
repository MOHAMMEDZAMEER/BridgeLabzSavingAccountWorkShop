package com.Savingaccount;

public class SavingAccountTest {

	private static final String SavingBalance = null;
	private static final String IntrestRate = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Initialiing Two SavingAccount With Balance
		SAVING_ACCOUNT Zameer = new SAVING_ACCOUNT(2000);
		
		SAVING_ACCOUNT Khan = new  SAVING_ACCOUNT(3000);
		
		//Set Intrest Rate to 4% and Calculating The Values
		SAVING_ACCOUNT.ModifyIntrestRate(4);
		Zameer.calculateMothlyIntrest();
		Khan.calculateMothlyIntrest();
		
		
		//Set Intrest Rate to 5% and Calculating The Values
		System.out.println();
		System.out.println("Monthly IntrestRate " +IntrestRate);
		System.out.println("Account Balance $" + SavingBalance);
		SAVING_ACCOUNT.ModifyIntrestRate(5);
		Zameer.calculateMothlyIntrest();
		Khan.calculateMothlyIntrest();
		
		
	}

}

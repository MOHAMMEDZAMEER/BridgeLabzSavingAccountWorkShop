package com.Savingaccount;

public class SAVING_ACCOUNT {
	
	private static double AnnulIntrestRate = 0d ;
	private double SavingBalance;

	
	public static double getAnnulIntrestRate() {
		return AnnulIntrestRate;
	}
	public static void setAnnulIntrestRate(double annulIntrestRate) {
		AnnulIntrestRate = annulIntrestRate;
	}
	public double getSavingBalance() {
		return SavingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		SavingBalance = savingBalance;
		
		
	}
	//Intializing Saving Balance
	public SAVING_ACCOUNT(double SavingBalance) {
		super();
		this.SavingBalance = SavingBalance;
		
	}
	//Calculating Intrest
	public void calculateMothlyIntrest() {
		 
		double IntrestRate =  SavingBalance *(AnnulIntrestRate/100)/12;
		SavingBalance += IntrestRate;
	
	}
	
	//Display Intrest and Accoount Balance

	public void display(double IntrestRate) {
		
		System.out.println("Monthly IntrestRate " +IntrestRate);
		System.out.println("Account Balance $" + SavingBalance);
		
	}
	//ModifyIntrestRate
	public static void ModifyIntrestRate(double NewIntrestRate) {
		AnnulIntrestRate = NewIntrestRate;
	}
	
	
	public static void setAnnualInterestRate(double newInterestRate) {
		AnnulIntrestRate = newInterestRate;
	}
	
}

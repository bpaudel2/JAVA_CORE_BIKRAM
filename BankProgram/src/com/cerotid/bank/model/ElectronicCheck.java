package com.cerotid.bank.model;

public class ElectronicCheck extends Transaction {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2211701757568928533L;
	private CheckType checkType;
	
	
	public ElectronicCheck(String senderAccountNumber, String receiverAccountNumber, double amount, double fee,CheckType checkType) {
		super(senderAccountNumber, receiverAccountNumber, amount, fee);
		this.checkType = checkType;
	}

	@Override
	public void createTransaction() {
		System.out.println("Transaction Competed using "+this.toString());
		
	}

	@Override
	public String toString() {
		return "ElectronicCheck [checkType=" + checkType + "]";
	}
	
	
	
	

}

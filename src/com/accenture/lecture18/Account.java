package com.accenture.lecture18;

public class Account {

	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {
		int newBalance = this.balance + amount;
		this.balance = newBalance;
		return newBalance;
	}

	public int debit(int amount) {
		int newBalance = this.balance;
		if (amount <= balance) {
			newBalance = balance - amount;
			this.balance = newBalance;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return newBalance;
	}

	public int transferTo(Account another, int amount) {
		if (amount <= this.balance) {
			another.balance = another.balance + amount;
			this.balance = this.balance - amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return this.balance;
	}

	@Override
	public String toString() {
		return "Account [id = " + id + ", name = " + name + ", balance = " + this.balance
				+ "]";
	}

	
}

package com.streamliners.Models;

public class Transaction {
    public String date;
    public float expense,income;
    //parameterised constructor for transaction class
    public Transaction(String date, float expense, float income) {
        this.date = date;
        this.expense = expense;
        this.income = income;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "date='" + date + '\'' +
                ", expense=" + expense +
                ", income=" + income +
                '}';
    }
}


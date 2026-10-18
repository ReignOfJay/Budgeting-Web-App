package com.dyyy;

import java.time.LocalDate;

public class Transaction{

    public String desc;
    public LocalDate tDate;
    public boolean income;

    public Transaction(String desc, LocalDate tDate, boolean income){
        this.desc = desc;
        this.tDate = tDate;
        this.income = income;
    }

    public String getDesc(){
        return desc;
    }

    public LocalDate getTDate(){
        return tDate;
    }

    public boolean getIncome(){
        return income;
    }
}
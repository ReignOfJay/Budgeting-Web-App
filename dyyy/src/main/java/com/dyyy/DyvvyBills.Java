package com.dyyy;

import java.time.LocalDate;

enum Priority{
    LOW,
    MEDIUM,
    HIGH,
    CRITICAL
}

//*************User can input recurring (in the future, non recurring necessities as well) expenses**************

public class DyvvyBills{

    private String billName;
    private Priority level;
    private double dueBal;
    private LocalDate dueDate;
    private boolean monthly;

    public DyvvyBills(String billName, Priority level, double dueBal, LocalDate dueDate, boolean monthly){
        this.billName = billName;
        this.level = level;
        this.dueBal = dueBal;
        this.dueDate = dueDate;
        this.monthly = monthly;
    }

    public String getBName(){
        return billName;
    }

    public Priority getlevel(){
        return level;
    }

    public double getDueBal(){
        return dueBal;
    }

    public LocalDate getDueDate(){
        return dueDate;
    }

    public boolean isMonthly(){
        return monthly;
    }

    public void setBName(String billName){
        this.billName = billName;
    }

    public void setPriority(Priority level){
        this.level = level;
    }

    public void setDueBal(double dueBal){
        this.dueBal = dueBal;
    }

    public void setDueDate(LocalDate dueDate){
        this.dueDate = dueDate;
    }

    public void setMonthly(boolean monthly){
        this.monthly = monthly;
    }

}


package com.dyyy;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class DyvvyGoal {

    private String goalName;
    private String desc;
    private double targetAmount;
    private double currAmount;
    private LocalDate deadline;
    private List<GoalItem> items;

    public DyvvyGoal(String goalName, String desc, double targetAmount, double currAmount, LocalDate deadline) {
        this.goalName = goalName;
        this.desc = desc;
        this.targetAmount = targetAmount;
        this.currAmount = currAmount;
        this.deadline = deadline;
        this.items = new ArrayList<>();
    }

    public String getGName(){
        return goalName;
    }

    public String getGDesc(){
        return desc;
    }

    public double getTargetAmount(){
        return targetAmount;
    }

    public double getCurrAmount(){
        return currAmount;
    }

    public LocalDate getDeadline(){
        return deadline;
    }

    public List<GoalItem> getItems(){
        return items;
    }

    public void addItem(GoalItem item){
        items.add(item);
    }

}

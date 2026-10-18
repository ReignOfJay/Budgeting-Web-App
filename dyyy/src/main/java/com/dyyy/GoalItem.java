package com.dyyy;

public class GoalItem {

    private String name;
    private double estimatedCost;

    public GoalItem(String name, double estimatedCost) {
        this.name = name;
        this.estimatedCost = estimatedCost;
    }

    public String getName() {
        return name;
    }

    public double getEstimatedCost() {
        return estimatedCost;
    }
}
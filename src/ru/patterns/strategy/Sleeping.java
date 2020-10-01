package ru.patterns.strategy;

public class Sleeping implements Activity {
    @Override
    public void doingSmth() {
        System.out.println("Sleeping.....");
    }
}

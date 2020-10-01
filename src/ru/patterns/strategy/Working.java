package ru.patterns.strategy;

public class Working implements Activity {

    @Override
    public void doingSmth() {
        System.out.println("Working...");
    }
}

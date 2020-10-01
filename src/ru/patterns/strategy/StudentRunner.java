package ru.patterns.strategy;

public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Начало дня студента");
        student.setActivity(new Sleeping());
        student.executeActivity();

        student.setActivity(new Learning());
        student.executeActivity();

        student.setActivity(new Working());
        student.executeActivity();

        student.setActivity(new Training());
        student.executeActivity();

        System.out.println("Конец дня студента");
        student.setActivity(new Sleeping());
        student.executeActivity();

    }


}

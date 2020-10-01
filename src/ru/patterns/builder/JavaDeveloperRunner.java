package ru.patterns.builder;

public class JavaDeveloperRunner {

    public static void main(String[] args) {
        String[] skills = {"Java", "Hibernate", "Maven", "PostgreSQL", "Gradle", "Spring"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Slava Petrenko", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: "+ javaDeveloper.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " " );
        }
    }

}

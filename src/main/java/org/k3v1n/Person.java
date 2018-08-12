package org.k3v1n;

import java.util.Comparator;
import java.util.List;

public class Person {

    private final String name;
    private final int age;
    private String nationality;

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
        nationality = null;
    }

    public Person(final String name, final int age, final String nationality) {
        this(name, age);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static Person getOldestPerson(final List<Person> collection) {
        return collection.stream()
                .max(Comparator.comparingInt(p -> p.age))
                .orElseGet(null);
    }
}

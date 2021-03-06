package com.danil.recyclerbindableadapter.sample.filter;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /*For search in firstName and lastName*/
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public static List<Person> getPersons() {
        List<Person> persons = new ArrayList<>(8);
        persons.add(new Person("John", "Travolta"));
        persons.add(new Person("Bob", "Marley"));
        persons.add(new Person("Alex", "Grey"));
        persons.add(new Person("Harry", "Potter"));
        persons.add(new Person("Jack", "Barakat"));
        persons.add(new Person("Clark", "Kent"));
        persons.add(new Person("Emil", "Lassaria"));
        persons.add(new Person("Roger", "Waters"));
        return persons;
    }


    public static List<Person> getAnotherPersons() {
        List<Person> persons = new ArrayList<>(8);
        persons.add(new Person("Leonardo", "DiCaprio"));
        persons.add(new Person("Tom", "Hanks"));
        persons.add(new Person("Zack", "Snyder"));
        persons.add(new Person("Steven", "Spilberg"));
        persons.add(new Person("Stanly", "Kubrick"));
        persons.add(new Person("Lena", "Headey"));
        persons.add(new Person("Mark", "Strong"));
        persons.add(new Person("Bruce", "Willis"));
        return persons;
    }


}

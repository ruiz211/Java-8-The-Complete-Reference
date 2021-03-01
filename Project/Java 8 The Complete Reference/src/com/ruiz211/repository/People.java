package com.ruiz211.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class People {
    private List<Person> people;

    public People() {
        this.people = new ArrayList<>();
        generatePeople();
    }

    public List<Person> getPeople() {
        return people;
    }

    private void generatePeople() {
        this.people.add(new Person(UUID.randomUUID().toString(), "user1", "John", "Scotland", "Funny", 50));
        this.people.add(new Person(UUID.randomUUID().toString(), "user2", "Charles", "England", "Boring", 65));
        this.people.add(new Person(UUID.randomUUID().toString(), "user3", "Mary", "Jefferson", "Killer", 23));
        this.people.add(new Person(UUID.randomUUID().toString(), "user4", "Lucy", "Jobs", "So so", 76));
        this.people.add(new Person(UUID.randomUUID().toString(), "user5", "Elizabeth", "Wick", "Killer", 63));
        this.people.add(new Person(UUID.randomUUID().toString(), "user6", "Victoria", "Thompson", "Killer", 86));
        this.people.add(new Person(UUID.randomUUID().toString(), "user7", "Sandy", "Turing", "Killer", 52));
        this.people.add(new Person(UUID.randomUUID().toString(), "user8", "Ian", "Wick", "Killer", 12));
        this.people.add(new Person(UUID.randomUUID().toString(), "user9", "Luke", "Wick", "Killer", 93));
        this.people.add(new Person(UUID.randomUUID().toString(), "user10", "Caroline", "Wick", "Killer", 45));
        this.people.add(new Person(UUID.randomUUID().toString(), "user11", "Margaret", "Wick", "Killer", 74));
    }
}
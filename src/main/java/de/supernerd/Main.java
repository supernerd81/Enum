package de.supernerd;

import java.util.Optional;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(weekday("Montag"));
        System.out.println(weekday("Mittwoch"));
        System.out.println(weekday("Freitag"));
        System.out.println(weekday("Samstag"));
        System.out.println(weekday("Sonntag"));

        Person person1 = new Person(UUID.randomUUID(), "Max Maier", DaysOfWeek.SONNTAG);
        Person person2 = new Person(UUID.randomUUID(), "Rudolf Müller", DaysOfWeek.MONTAG);
        Person person3 = new Person(UUID.randomUUID(), "Max Maier", DaysOfWeek.DIENSTAG);
        Person person4 = new Person(UUID.randomUUID(), "Felix Mayer", DaysOfWeek.MITTWOCH);

        PersonRepository personRepository = new PersonRepository();
        personRepository.addPerson(person1);
        personRepository.addPerson(person2);
        personRepository.addPerson(person3);
        personRepository.addPerson(person4);

        Optional<Person> result = personRepository.search(person1.id());

        if(result.isEmpty()) {
            System.out.println("Person nicht gefunden!");
        } else {
            System.out.println(result);
        }

        result = personRepository.search(UUID.randomUUID());

        if(result.isEmpty()) {
            System.out.println("Person nicht gefunden!");
        } else {
            System.out.println(result);
        }
    }

    public static String weekday(String weekday) {

        if(DaysOfWeek.SAMSTAG.name().equals( weekday.toUpperCase()) || DaysOfWeek.SONNTAG.name().equals( weekday.toUpperCase())) {
            return "Wochenende";
        }

        return weekday;
    }
}

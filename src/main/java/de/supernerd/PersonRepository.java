package de.supernerd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PersonRepository {

    private List<Person> personen;

    public PersonRepository() {
        this.personen = new ArrayList<>();
    }

    public PersonRepository(List<Person> personen) {
        this.personen = personen;
    }

    public List<Person> getPersonen() {
        return personen;
    }

    public void setPersonen(List<Person> personen) {
        this.personen = personen;
    }

    public void addPerson(Person personName) {
        this.personen.add(personName);
    }

    public Optional<Person> search(UUID id) {

        for(Person person : this.personen) {
            if(person.id() == id) {
                return Optional.of(person);
            }
        }

        return Optional.empty();
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "personen=" + personen +
                '}';
    }
}

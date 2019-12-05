package entities;

import java.util.ArrayList;
import java.util.List;

public class People {

    private List<Person> people = new ArrayList<Person>();

    public Person getPersonByName(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public Person getPersonByPhone(String phoneNumber) {
        for (Person person : people) {
            if (person.getListPhoneNumbers().contains(phoneNumber)) {
                return person;
            }
        }
        return null;
    }

    public void add(Person person) {
        people.add(person);
    }

    public void remove(Person person) {
        people.remove(person);
    }

    public boolean notContains(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public List<Person> getPeople() {
        return people;
    }

}

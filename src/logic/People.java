package logic;

import java.util.ArrayList;
import java.util.List;

public class People {

    private List<Person> people = new ArrayList<Person>();

    public Person getPerson(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public void add(Person person) {
        people.add(person);
    }

    public boolean contains(String name) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public List<Person> getPeople() {
        return people;
    }

}

package ui;

import java.util.Scanner;
import entities.People;
import entities.Person;

public class Commands {

    private People people = new People();
    private Scanner scanner;

    public Commands(Scanner scanner) {
        this.scanner = scanner;
    }

    public void addNumber() {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        System.out.print("number: ");
        String phoneNumber = scanner.nextLine();

        if (people.notContains(name)) {
            Person person = new Person(name);
            person.addPhoneNumber(phoneNumber);
            people.add(person);
        } else {
            people.getPersonByName(name).addPhoneNumber(phoneNumber);
        }
    }

    public void searchNumber() {
        System.out.print("whose number: ");
        String name = scanner.nextLine();
        Person person = people.getPersonByName(name);
        if (person == null) {
            System.out.println("  not found");
        } else {
            for (String number : person.getListPhoneNumbers()) {
                System.out.println(" " + number);
            }
        }
    }

    public void searchPerson() {
        System.out.print("number: ");
        String phoneNumber = scanner.nextLine();
        Person person = people.getPersonByPhone(phoneNumber);
        if (person == null) {
            System.out.println(" not found");
        } else {
            System.out.println(" " + person.getName());
        }
    }

    public void addAddress() {
        System.out.print("whose address: ");
        String name = scanner.nextLine();
        System.out.print("street: ");
        String street = scanner.nextLine();
        System.out.print("city: ");
        String city = scanner.nextLine();
        if (people.notContains(name)) {
            Person person = new Person(name);
            person.setAddress(city, street);
            people.add(person);
        } else {
            people.getPersonByName(name).setAddress(street, city);
        }

    }

    public void getInformation() {
        System.out.print("whose information: ");
        String name = scanner.nextLine();
        Person person = people.getPersonByName(name);
        if (person == null) {
            System.out.println(" not found");
        } else {
            System.out.println(person.getAddress());
            System.out.println(person.getPhoneNumbers());
        }
    }

}

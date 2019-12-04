package ui;

import java.util.Scanner;
import logic.People;
import logic.Person;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private People people = new People();

    public void run() {
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");
        options();
    }

    public void options() {
        while (true) {
            System.out.println();
            System.out.print("command: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addNumber();
                    break;
                case "2":
                    searchNumber();
                    break;
                case "3":
                    searchPerson();
                    break;
                case "4":
                    addAddress();
                    break;
                case "5":
                    getInformation();
                    break;
                case "6":
                    System.out.println();
                    break;
                case "7":
                    System.out.println();
                    break;
                case "x":
                    return;
                default:
                    System.out.println("That is not a valid choice.");
            }
        }
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

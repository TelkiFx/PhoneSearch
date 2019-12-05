package entities;

import java.util.SortedSet;
import java.util.TreeSet;

public class Person implements Comparable<Person> {

    private String name;
    private SortedSet<String> phoneNumbers = new TreeSet<String>();
    private String address;

    public Person(String name) {
        this.name = name;
    }

    public void setAddress(String street, String city) {
        this.address = street + " " + city;
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumbers() {
        StringBuilder builder = new StringBuilder();
        if (!phoneNumbers.isEmpty()) {
            int i = 0;
            for (String phoneNumber : phoneNumbers) {
                if (i < phoneNumbers.size() - 1) {
                    builder.append("   ").append(phoneNumber).append("\n");
                    i += 1;
                }
            }
            builder.append("   ").append(phoneNumbers.last());
            return builder.toString();
        }
        return "  phone number not found";
    }

    public SortedSet<String> getListPhoneNumbers() {
        return phoneNumbers;
    }

    public String getAddress() {
        if (address == null) {
            return "  address unknown";
        }
        return "  address: " + address;
    }

    @Override
    public String toString() {
        String information = " " + getName() + "\n";
        information += getAddress() + "\n";
        information += "  phone numbers:\n";
        information += getPhoneNumbers();
        return information;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

}

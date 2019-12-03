package logic;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private String name;
    private Set<String> phoneNumbers = new HashSet<String>();
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return getName() + " (" + getPhoneNumbers() + ")" + "\n" + getAddress();
    }
}

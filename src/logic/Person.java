package logic;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {

    private String name;
    private Set<String> phoneNumbers = new HashSet<String>();
    private String address;

    public Person(String name) {
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

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (!(object instanceof Person)) {
            return false;
        }
        Person that = (Person) object;
        return Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private List<String> phoneNumbers = new ArrayList<String>();
    private String address;

    public Person(String name) {
        this.name = name;
    }

    public void setAddress(String street, String city) {
        this.address = street + " " + city;
    }

    public void addPhoneNumber(String phoneNumber) {
        if (!phoneNumbers.contains(phoneNumber)) {
            phoneNumbers.add(phoneNumber);
        }
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumbers() {
        StringBuilder builder = new StringBuilder();
        if (!phoneNumbers.isEmpty()) {
            builder.append("  phone numbers:").append("\n");
            for (int i = 0; i < phoneNumbers.size(); i++) {
                if (i < phoneNumbers.size() - 1) {
                    builder.append("   ").append(phoneNumbers.get(i)).append("\n");
                } else {
                    builder.append("   ").append(phoneNumbers.get(i));
                }
            }
            return builder.toString();
        }
        return "  phone number not found";
    }

    public List<String> getListPhoneNumbers() {
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
        String information = getName() + "\n";
        information += getAddress() + "\n";
        information += getPhoneNumbers();
        return information;
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

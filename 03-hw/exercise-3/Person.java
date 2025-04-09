public class Person {
    public String firstName;
    public String lastName;
    public Address address;

    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" + address.toString();
    }
}
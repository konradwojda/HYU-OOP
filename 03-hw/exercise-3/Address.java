public class Address {
    private String street;
    public String city;
    public String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void printAddress() {
        System.out.println(street + ", " + city + " " + zipCode);
    }

    @Override
    public String toString() {
        return street + ", " + city + " " + zipCode;
    }
}
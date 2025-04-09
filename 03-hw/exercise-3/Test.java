public class Test {
    public static void main(String[] args) {
        Address addr = new Address("123 Maple St", "Springfield", "12345");
        Student student = new Student("John", "Doe", addr, "S123", 2, 111, 35);
        System.out.println(student);
    }
}

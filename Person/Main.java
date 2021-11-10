package Udemy.Person;

public class Main {
    public static void main(String[] args) {
        Person person=new Person();
        person.setFirstName("Stefan");
        person.setLastName("Stefanov");
        person.setAge(15);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        System.out.println(person.GetFullName());
    }
}

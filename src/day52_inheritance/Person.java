package day52_inheritance;

public class Person {
    String name = "James Bond";

}
class SecretIdentity extends Person{

}
class Runner{
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);

        SecretIdentity secretIdentity = new SecretIdentity();
        System.out.println(secretIdentity.name);

    }


}
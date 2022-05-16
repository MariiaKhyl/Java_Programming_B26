package day5_05_09_2022.animal;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Gold" , 4, "Golden");
        Dog dog2 = new Dog("Gold" , 4, "Golden");
        Dog dog3 = new Dog("Silver" , 1, "Golden");

        System.out.println(dog1);

        System.out.println(dog1.equals(dog2));

        System.out.println(dog1.equals(dog3));

        System.out.println(dog2.equals(dog1));

    }
}

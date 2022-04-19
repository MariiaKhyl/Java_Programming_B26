package day42_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {

        Animal bird = new Animal();
        bird.population = 100000000;
        bird.species = "Bird";
        System.out.println(bird.toString());

    }
}

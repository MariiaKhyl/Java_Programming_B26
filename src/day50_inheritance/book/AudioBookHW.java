package day50_inheritance.book;

public class AudioBookHW extends BookHW {

    double duration;
    String narrator;

    public void listen(){
        System.out.println("Listening to "+ title+ " narrated by "+narrator);
    }


/*
Create a class AudioBook

    - AudioBook class inherits Book class

    - create additional variables:
        duration, narrator

    - create method:
        listen()
            Example output: prints listening to $title narrated by $narrator
 */
}

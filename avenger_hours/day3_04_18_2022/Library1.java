package day3_04_18_2022;

import day37_wrapper_class.ArrayListExample;

import java.util.ArrayList;
import java.util.Arrays;

public class Library1 {
    public static void main(String[] args) {

        Book1 b1 = new Book1("Moby Dick", "classics","Herman Melville");
       // novel.IDgenerator();
        System.out.println(b1);
        Book1 b2 = new Book1("Any Book","Fantasy", "Any Author");
        Book1 b3 = new Book1("Crime and Punishment", "Classics", "Fyodor Dostoevsky");
        Book1 b4 = new Book1("The Three Musketeers", "adventure", "Alexandre Dumas");
        Book1 b5 = new Book1("Moby Dick", "adventure", "Herman Melville");
        Book1 b6 = new Book1("Sandman", "comics", "Neil Gaiman");
        Book1 b7 = new Book1("Europe: A History", "history", "Norman Davies");
        Book1 b8 = new Book1("Game of Thrones", "fantasy", "George R. Martin");

        System.out.println(Book1.bookCount);

        ArrayList<Book1> allBooks = new ArrayList<>(Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8));
        System.out.println(allBooks);



    }
}

package day3_04_18_2022;

public class Library {
    public static void main(String[] args) {
        /*
        -Create a class named Library
        -create Book objects
        -find the number off all books in the
        library with the help of "static" feature
        -create allBooks arrayList
        -create fantasyBooks arraylist by using allBooks collection
         */

        Book book1 = new Book("Moby Dick", "Adventure","Herman Melville");
        System.out.println("Static book count "+Book.bookCount);
        System.out.println(book1);





    }
}

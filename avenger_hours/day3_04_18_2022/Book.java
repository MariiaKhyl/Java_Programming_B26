package day3_04_18_2022;

public class Book {
/*
 Topics : - Data Types Vs Variable Types
                 - Classes and Objects
                 - Task 01 (class, objects, instance/static variables, constructors, static block, arrayList, etc. )
*/
    String name, category, author, bookID;
    int shelfNum;

    static int bookCount;
    static{

        bookCount = 0;
    }

    public Book(String name) {
        this.name = name;
        bookCount++;
    }

    public Book(String name, String category) {
        this.name = name;
        this.category = category;
    }
    public Book(String name, String category, String author){
        this(name,category);
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book: " +
                "name - " + name +
                ", category - " + category  +
                ", author - " + author  +
                ", bookID - " + bookID  +
                ", shelfNum - " + shelfNum;
    }
    public String IDgenerator(int shelfNum, String bookID, String author, String name){

        if (shelfNum == 1){
            return "Adventure";
        }else if (shelfNum == 2){
            return "Classics";
        }else if(shelfNum == 3){
            return "Comics";
        }else if (shelfNum == 4){
            return "Fantasy";
        }else if (shelfNum == 5){
            return "History";
        }else if (shelfNum == 0){
            return "Otherwise";
        }
        bookCount++;
        bookID =shelfNum+"_"+author.charAt(0)+"_"+name.toUpperCase().substring(0,2);

        return bookID;
    }
    /*
Task 01 :
   -Create a class named Book,
        -5 Instance variables : String name, category, author, bookID;
                              int shelfNum(assign it with respect to categories );
        -1 Static variable :    int bookCount; (initiate it in a static block)
        -3 constructors : name /// name + category /// name + category + author  (implement constructor chaining)
        -2 methods : 1- toString()
                     2- IDgenerator() -> assign shelfNum and assign bookID with that format; ShelfNum_AuthorNameInitial_BookNameFirst2letters
                     (eg: adventure book =>  Moby Dick / Herman Melville; bookID= 1_H_Mo)
                                        Categories:  - Adventure (shelfNum = 1)
                                                     - Classics (shelfNum = 2)
                                                     - Comics (shelfNum = 3)
                                                     - Fantasy (shelfNum = 4)
                                                     - History (shelfNum = 5)
                                                     - Otherwise (shelfNum = 0)
   =======================================================================================

   -Create a class named Library
        -create Book objects
        -find the number off all books in the
        library with the help of "static" feature
        -create allBooks arrayList
        -create fantasyBooks arraylist by using allBooks collection

 */

}

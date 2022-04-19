package day3_04_18_2022;

public class Book1 {
    String name, category, author, bookID;
    int shelfNum;

    static int bookCount;

    static{
        bookCount=0;
    }

    public Book1(String name){
        this.name=name;
        bookCount++;
    }

    public Book1(String name, String category){
        this(name);
        this.category = category;
    }

    public Book1(String name, String category, String authorr){
        this(name,category);
        author = authorr;
        IDgenerator();
    }

    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", author='" + author + '\'' +
                ", bookID='" + bookID + '\'' +
                '}';
    }

    public void IDgenerator(){
        switch (category.toLowerCase()){
            case "adventure" : shelfNum=1; break;
            case "classics" : shelfNum=2; break;
            case "comics" : shelfNum=3; break;
            case "fantasy" : shelfNum=4; break;
            case "history" : shelfNum=5; break;
            default:shelfNum=0;
        }
        bookID = shelfNum + "_" + author.substring(0,1) + "_" + name.substring(0,2);
    }
}

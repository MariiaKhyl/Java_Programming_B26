package home_work_day55;

public class Library {
    public static void main(String[] args) {

        Book book = new JavaTextbook();
        book.read();
        book.name = "Cinderella";
        System.out.println(book.name);
        System.out.println("+++++++++++++++++++++++++");

        Downloadable book2 = new JavaTextbook();
        book2.download();
        System.out.println(book2);
        System.out.println("======================");

        EBook book3 = new JavaTextbook();
        book3.size= 44;
        book3.open();
        book3.read();
        book3.name = "Snow White";
        book3.download();
        System.out.println(book3.size);
        System.out.println("++++++++++++++++++++++++++");

        JavaTextbook book4 = new JavaTextbook();
        book4.fun=true;
        book4.download();
        book4.read();
        book4.open();
        book4.name = "Mulan";
        System.out.println(book4);


    }
}

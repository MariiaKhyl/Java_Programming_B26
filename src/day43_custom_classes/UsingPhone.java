package day43_custom_classes;

public class UsingPhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone("IPhone X");
        System.out.println(phone1);

        Phone phone2 = new Phone("IPhone 12", "Apple");
        System.out.println(phone2);

        Phone phone3 = new Phone("IPhone", "Apple",64,12);
        System.out.println(phone3);

    }
}

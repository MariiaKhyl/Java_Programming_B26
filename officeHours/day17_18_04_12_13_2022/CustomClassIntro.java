package day17_18_04_12_13_2022;

public class CustomClassIntro {

    public static void main(String[] args) {




            // Create a new OBJECT from CustomClassIntro


            new CustomClassIntro();
            // there is no reference to

            System.out.println("==============");
            CustomClassIntro c = new CustomClassIntro();
            System.out.println(c);

            System.out.println("==============");
            // Call instance Var
           //  c.instanceVariable="Instance Variable from Main Method";
            System.out.println(c);


            System.out.println("==============");
            // Call instance method
            // c.instanceMethod();
            System.out.println(c);


            // Create a new OBJECT

            System.out.println("==============");
            CustomClassIntro c2 = new CustomClassIntro();
            System.out.println(c2.toString());



    }
}

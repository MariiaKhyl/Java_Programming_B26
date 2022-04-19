package day07_unary_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Targer";
        int numberOfTvs = 100;
        System.out.println("Person comes into the store and they bought a tv");
        System.out.println("Number of tvs now: "+ --numberOfTvs);

        System.out.println("Person comes into the store and they bought a tv");
        System.out.println("Number of tvs now: "+ --numberOfTvs);

        System.out.println("Person cames into the store and they bought a tv");
        System.out.println("Number of tvs now: "+ --numberOfTvs);

        System.out.println("Person cames into the store and they bought a tv");
        System.out.println("Number of tvs now: "+ numberOfTvs--);
        System.out.println("Person cames into the store and they bought a tv");
        System.out.println("Number of tvs now: "+ numberOfTvs--);
        System.out.println("Number of tvs now: "+ numberOfTvs);



    }
}

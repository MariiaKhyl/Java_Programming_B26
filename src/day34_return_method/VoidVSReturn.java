package day34_return_method;

public class VoidVSReturn {
    public static void main(String[] args) {

        sayHello();
        //String msg = sayHello(); this doesn't work because the method is void

        sayBye();
        System.out.println(sayBye());

    }

    public static void sayHello(){
        System.out.println("Hello");
    }
   public static String sayBye(){
        return "Bye";
   }



}

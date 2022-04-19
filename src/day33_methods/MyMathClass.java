package day33_methods;

public class MyMathClass {

    public static void add(double numOne, double numTwo){

        System.out.println(numOne+" + "+numTwo+" = "+(numOne+numTwo));
    }

    public static void subtract(double numOne, double numTwo){

        System.out.println(numOne+" - "+numTwo+" = "+(numOne-numTwo));
    }

    public static void multiply(double numOne, double numTwo){

        System.out.println(numOne+" * "+numTwo+" = "+(numOne*numTwo));
    }

    public static void division(double numOne, double numTwo){

        if (numTwo != 0){
            System.out.println(numOne+" / "+numTwo+" = "+(numOne/numTwo));
        }else{
            System.out.println("Cannot divide by 0");
        }
    }

    public static void main(String[] args) {
        add(5.5,10);
        add(4,6);
        division(4,0);
    }

}

package home_work_day49.sdet;

public class Developer extends Employee {
    /*
    - Developer class inherits Employee class

    - create additional variables:
        features created

    - create method:
        develop()
            Example output: prints Creating more features

Create objects of all three to see which variables and methods each object has access to
     */
    boolean futureCreated;

    public void develop(){
        System.out.println(name + " creating more features");
    }


}

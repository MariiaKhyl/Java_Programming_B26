package home_work_day45.sdet;

public class Employee {
    /*
    - create variables:
        name, is full time, salary

    - create method:
        work()
            Example output: prints $name is working
            */
    String name;
    boolean fullTime;
    double salary;

    public void work(){
        System.out.println(name+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", fullTime=" + fullTime +
                ", salary=" + salary +
                '}';
    }

    /*

Create a class Tester

    - Tester class inherits Employee class

    - create additional variables:
        bugs found

    - create method:
        test()
            Example output: prints Running the regression

Create a class Developer

    - Developer class inherits Employee class

    - create additional variables:
        features created

    - create method:
        develop()
            Example output: prints Creating more features

Create objects of all three to see which variables and methods each object has access to
     */
}

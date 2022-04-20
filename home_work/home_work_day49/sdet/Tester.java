package home_work_day49.sdet;

import home_work_day49.sdet.Employee;

public class Tester extends Employee {
    /*
    Create a class Tester

    - Tester class inherits Employee class

    - create additional variables:
        bugs found

    - create method:
        test()
            Example output: prints Running the regression
     */
    boolean bugsFound;

    public void test(){
        System.out.println(name +" running the regression");
    }

}

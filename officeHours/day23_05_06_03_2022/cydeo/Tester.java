package day23_05_06_03_2022.cydeo;

public final class Tester extends Employee{

    /*
      1. Tester
       variables: name, gender, age, jobTitle, employeeID, salary
       methods: work(), attendMeeting()
     */
    public Tester (String name, char gender,int age, String jobTitle, int employeeId, double salary){
        super(name, gender, age, jobTitle, employeeId, salary);
    }
    public void work(){
        System.out.println(getName()+" is working");
    }
    public void attendMeeting(){
        System.out.println(getJobTitle()+" "+getName()+" is attending meeting");
    }

    public void drink(String beverage){
        System.out.println(getJobTitle()+getName()+" is drinking "+beverage);
    }

}

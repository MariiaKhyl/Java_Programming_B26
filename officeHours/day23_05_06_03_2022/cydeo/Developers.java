package day23_05_06_03_2022.cydeo;

public final class Developers extends Employee{

    /*
    Developer
                	variables: name, gender, age, jobTitle, employeeID, salary
                    methods: work(), attendMeeting()
     */

    public Developers(String name, char gender, int age, String jobTitle, int employeeId, double salary){
        super(name, gender, age, jobTitle, employeeId, salary);
    }
    public void work(){
        System.out.println(getName()+" working");
    }
    public void attendMeeting(){
        System.out.println(getJobTitle()+" "+getName()+" is attending meeting");
    }
    public void drink(){
        System.out.println(getName()+" drinking");
    }
    public void sleep(){
        System.out.println(getName()+" sleeping");
    }
    public void eat(){
        System.out.println(getName()+" eating");
    }


}

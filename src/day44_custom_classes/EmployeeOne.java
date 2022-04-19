package day44_custom_classes;

public class EmployeeOne {

    String name, jobTitle;
    int id;
    double salary;

     public EmployeeOne(String name, String jobTitle){

         this.name = name;
         this.jobTitle = jobTitle;
     }

    public EmployeeOne(String name, String jobTitle, int id, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary= salary;
    }

    public void goToMeeting(){
        System.out.println(name+" is going to meeting");
    }

    public String toString(){
         return name+ " - "+jobTitle+" - "+id+" - $"+salary;


    }

}

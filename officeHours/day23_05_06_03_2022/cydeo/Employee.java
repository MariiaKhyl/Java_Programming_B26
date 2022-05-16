package day23_05_06_03_2022.cydeo;

public class Employee extends Person{

    /*
     2. Employee
       variables: name, gender, age, jobTitle, employeeID, salary
       methods: work(), attendMeeting()
     */

    private String jobTitle;
    private int employeeId;
    private double salary;

    public Employee(String name, char gender, int age, String jobTitle,int employeeId,double salary){
        super(name, gender, age);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }
    public void attendMeeting(){
        System.out.println(getName()+" is on a meeting");
    }
    public String toString(){
        return "Employee "+super.toString()+", job title "+jobTitle+", employee ID "+employeeId+", salary "+salary;
    }


}

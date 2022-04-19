package home_work_day43;

public class Employee {
    /*
    create a class called Employee

        - data:

            name, id, job title, salary

        - constructor

            - create a constructor that creates an Employee object with the name and job title

            - create a constructor that creates an Employee object with the name, id, job title, and salary

        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information

    Create a separate class to create and test the Employee objects
     */

    String name, jobTitle;
    int id;
    double salary;



    public  Employee(String name, String jobTitle){
     this.name = name;
     this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;

    }
    public void goToMeeting(){
        System.out.println(name+ " is going to the meeting");
    }

    @Override
    public String toString() {

        String obj = name;

        if (jobTitle != null){
            obj+=", "+jobTitle;
        }
        if (id != 0){
            obj+=", "+id;
        }
        if (salary!=0.0){
            obj+=", $"+salary;
        }

        return obj;

    }
}

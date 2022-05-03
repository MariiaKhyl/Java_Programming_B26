package home_work_day52.person;

public abstract class Employee extends Person {

    String jobTitle;
    double salary;

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    Create a class Employee

make this class abstract

inherits Person class

define variables:
    job title, salary

define abstract method:
    work()

override the toString method

     */
}

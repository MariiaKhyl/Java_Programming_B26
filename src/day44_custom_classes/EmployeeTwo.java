package day44_custom_classes;

public class EmployeeTwo {

    String name, jobTitle;
    int id;
    double salary;

    public EmployeeTwo(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;

    }
    public EmployeeTwo(String name, String jobTitle, int id, double salary){
        this(name,jobTitle);
        this.id = id;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "EmployeeTwo{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

package day20_04_26_27_2022.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee = new Employee("Mike", 'M',29,150.000);
        System.out.println(employee);

        //employee.age(); can't do like this because it is private access modifier

        //change name
        employee.setName("");
        System.out.printf(employee.getName());

        //change age
        employee.setAge(15);
        System.out.println(employee.getAge());

        //change salary
        employee.setSalary(1000000);
        System.out.println(employee.getSalary());

        // increase the salary of employee +20K
        employee.setSalary(employee.getSalary()+20000);
        System.out.println(employee.getSalary());

        // decrease salary of employee -30K
        employee.setSalary(employee.getSalary()-30000);
        System.out.println(employee.getSalary());



    }
}

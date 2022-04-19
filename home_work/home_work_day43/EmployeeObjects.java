package home_work_day43;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Mariia", "SDET");
        System.out.println(employee1);

        Employee employee2 = new Employee("Mariia","SDET",1121993,110.000);
        System.out.println(employee2);
        employee1.goToMeeting();
        employee2.goToMeeting();

    }
}

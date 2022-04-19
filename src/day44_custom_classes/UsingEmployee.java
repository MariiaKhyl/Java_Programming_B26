package day44_custom_classes;

import home_work_day43.Employee;

public class UsingEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee("James","Secret agent");
        System.out.println(employee1);
        employee1.goToMeeting();

    }
}

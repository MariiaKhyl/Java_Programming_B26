package home_work_day45.sdet;

public class usingSDET {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name = "Mary";
        employee.fullTime = true;
        employee.salary = 120_000;
        employee.work();
        System.out.println(employee);

        Tester tester = new Tester();
        tester.bugsFound = false;
        tester.name ="Bobby";
        tester.fullTime = true;
        tester.salary = 125_000;
        tester.work();
        tester.test();
        System.out.println(tester);

        Developer developer = new Developer();
        developer.name = "Anny";
        developer.fullTime = false;
        developer.salary = 150_000;
        developer.futureCreated = true;
        developer.work();
        developer.develop();
        System.out.println(developer);




    }
}

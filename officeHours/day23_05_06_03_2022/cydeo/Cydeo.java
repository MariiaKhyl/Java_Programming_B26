package day23_05_06_03_2022.cydeo;

public class Cydeo {
    public static void main(String[] args) {

        Student student = new Student("Mike", 'M',29,1,"Cydeo");

        System.out.println(student);

        Tester tester = new Tester("James", 'M', 25, "Tester", 1111,150.000);
        System.out.println(tester);

        //Override Methods
        tester.attendMeeting();
        tester.work();
        tester.drink();

        //Comes from parents
        tester.eat();
        tester.sleep();

        Developers develop = new Developers("Joe", 'M',30,"Developer", 12123, 180.000);
        System.out.println(develop);
        develop.attendMeeting();
        develop.work();
        develop.drink();
        develop.sleep();
        develop.eat();

        Teacher teacher = new Teacher("Lora",'F',33,"Teacher", 24235, 90.000);
        System.out.println(teacher);
        teacher.work();
        teacher.eat();
        teacher.drink();

    }
}

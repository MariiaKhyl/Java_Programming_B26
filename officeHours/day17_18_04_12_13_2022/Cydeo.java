package day17_18_04_12_13_2022;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class Cydeo {
    public static void main(String[] args) {

        Student student = new Student("Mary");
        Student student2 = new Student("Garry", 25);
        Student student3 = new Student("Mike", 33, 26);
        Student student4 = new Student("Dembe", 30, 25);
        Student student5 = new Student("Nataly", 29, 24);
        Student student6 = new Student("John", 18, 23);
        Student student7 = new Student("Mehmet", 27, 26);
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);

        ArrayList<Student> allStudents = new ArrayList<>(Arrays.asList(student,student2,student3,student4,student5,student6,student7));
        System.out.println(allStudents);
//        allStudents.add(student2);
//        allStudents.add(student3);
        System.out.println(allStudents);

        System.out.println(allStudents.get(0).name);

        ArrayList<Student> b26Students = new ArrayList<>();
        for (Student eachStudent : allStudents) {

            if(eachStudent.batchNumber == 26){
                System.out.println(eachStudent.batchNumber);
                b26Students.add(eachStudent);
            }
            System.out.println(b26Students);
        }

        allStudents.removeIf(eachStudent -> eachStudent.batchNumber!=26);
        System.out.println(allStudents);

    }
}

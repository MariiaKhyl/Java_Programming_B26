package day23_05_06_03_2022.cydeo;

public class Student extends Person{

    /*
     1. Student
                	 variables: name, gender, age, schoolName, studentId
                	 methods: study(), attendClass()
     */

    private String school;
    private int id;

    public Student(String name, char gender, int age,int id, String school){
        super(name,gender,age);
        setId(id);
        setSchool(school);
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school=school;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public void study(){
        System.out.println(getName()+"is studying");
    }
    public void attendClass(){
        System.out.println(getName()+"attending class");
    }

    public String toString(){
        return "Student "+super.toString()+", id "+id+", school name "+school;
    }



}

package day23_05_06_03_2022.cydeo;

public class Person {

    /*
           1. create a class named Person
                	variables: name, gender, age
                	 methods: eat(), sleep(), drink()
     */

    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age){
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }



    public void eat(){
        System.out.println(name+"is eating");
    }
    public void sleep(){
        System.out.println("Sleep");
    }
    public void drink(){
        System.out.println("Drink");
    }

    public String toString(){
        return
        "name "+name+", gender "+gender+", age "+age;
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drink(String beverage){
        System.out.println(name+" is drinking "+beverage);
    }
    public void sleep(boolean sleep){
        System.out.println(name+" is sleeping "+ sleep);
    }



}

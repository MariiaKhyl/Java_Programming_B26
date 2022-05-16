package day23_05_06_03_2022.cydeo;

public final class Teacher extends Employee{
    /*
    3. Teacher
                	variables: name, gender, age, jobTitle, employeeID, salary
                    methods: work(), attendMeeting()
     */
    public Teacher(String name, char gender, int age, String jobTitle, int employeeId, double salary){
        super(name, gender, age, jobTitle, employeeId, salary);
    }
    public void work(){
        System.out.println(getName()+" is working as a teacher");
    }
    public void eat(){
        System.out.println(getName()+" is eating in school");
    }
    public void drink(){
        System.out.println(getName()+" drinking in school");
    }

}

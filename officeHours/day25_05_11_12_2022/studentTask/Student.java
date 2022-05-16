package day25_05_11_12_2022.studentTask;

public abstract class Student extends Person{

    private String batchNumber;

    public Student(String name, int age, String batchNumber){
        super(name,age);
        setBatchNumber(batchNumber);
    }

    public String getBatchNumber(){
        return batchNumber;
    }
    public void setBatchNumber(String batchNumber){
        this.batchNumber=batchNumber;
    }


    public abstract void attendClass();

    public void code(String language){
        System.out.println(language+ " he is speaking");
    }

}

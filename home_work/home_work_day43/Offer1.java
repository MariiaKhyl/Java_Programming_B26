package home_work_day43;

public class Offer1 {
    /*
    create a class called Offer

        - data:

            location, company, salary, is full time, number of PTO

        - constructor

            - create a constructor that creates an Offer object with the company and location

            - create a constructor that creates an Offer object with the company, location, and salary

            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO


        - method:

            toString()
                print all the employees information

    Create a separate class to create and test the Offer objects

     */

    String location, company;
    boolean isFullTime;
    double salary, numberOfPto;

    public Offer1(String company, String location){
        this.company = company;
        this.location = location;
    }
    public Offer1(String company, String location, double salary){
        this.company = company;
        this.location = location;
        this.salary = salary;
    }

    public Offer1(String company, String location, boolean isFullTime, double salary, double numberOfPto) {
        this.location = location;
        this.company = company;
        this.isFullTime = isFullTime;
        this.salary = salary;
        this.numberOfPto = numberOfPto;
    }

    @Override
    public String toString() {

        String obj ="\""+ company+"\"";

        if (location!= null){
            obj+=", "+location;
        }
        if (isFullTime){
            obj+="This is full time position";
        }else{
            obj+="This is part time position";
        }

        if (salary!=0.0){
            obj+=", "+salary;
        }
        if (numberOfPto!=0.0){
            obj+=", "+numberOfPto;
        }


        return obj;
    }
}

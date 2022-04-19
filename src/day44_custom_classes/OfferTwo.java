package day44_custom_classes;

public class OfferTwo {
    String company, location;
    double salary;
    boolean isFullTime;
    int numberOfPTO;

    public OfferTwo(String company, String location) {
        this.company = company;
        this.location = location;
    }

    public OfferTwo(String company, String location, double salary) {
        this(company, location);
        this.salary = salary;
    }

    public OfferTwo(String company, String location, double salary, boolean isFullTime, int numberOfPTO) {
        this(company,location,salary);
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }




}

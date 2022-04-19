package home_work_day05;

public class CarInfo {
    public static void main(String[] args) {

        String carModel, driverName;
        int licenseNumber, speed;
        boolean isAutomatic = true;
        char licenseClass = 'D';
        carModel = "Toyota";
        driverName = "Mariia Khyl";
        licenseNumber = 12345;
        speed = 280;

        System.out.println("I got a new car.\nThe model is - "+carModel+".\nPlus, I got new driver license with my name on it - "+driverName+".\nThe license number is "+licenseNumber+" and speed - "+speed+"\nCar is automatic. That is "+isAutomatic+"\nAnd my license calss is "+licenseClass);

    }
}

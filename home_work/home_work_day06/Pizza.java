package home_work_day06;

public class Pizza {
    public static void main(String[] args) {

        String typeOfPizza = "Pepperoni";
        int numberOfSlices = 8;
        int numberOfPeopleEating = 4;
        int slicePerPerson = numberOfSlices / numberOfPeopleEating;
        //System.out.println(slicePerPerson);

        int slicesThatTheyWillAte = slicePerPerson * numberOfPeopleEating;
        //System.out.println(slicesThatTheyWillAte);
        int slicesLeftOver = numberOfSlices - slicesThatTheyWillAte;
        //System.out.println(slicesLeftOver);
        System.out.println("We ordered cheese pizza with "+numberOfSlices+" slices, "+numberOfPeopleEating+" people ate "+slicePerPerson+" slices each with "+slicesLeftOver+" left over." );






    }
}

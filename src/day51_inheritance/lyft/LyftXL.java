package day51_inheritance.lyft;

public class LyftXL extends Lyft{

    public LyftXL(String driver){
        super(driver);
    }

    @Override
    public double calculateTheRates(int miles) {
        return super.calculateTheRates(miles)*1.1;
    }
    
}

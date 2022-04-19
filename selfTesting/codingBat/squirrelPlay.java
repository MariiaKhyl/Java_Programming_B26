package codingBat;

public class squirrelPlay {
    public static boolean squirrelPlay(int temp, boolean isSummer){

        if(isSummer == true && temp >= 100 && temp >= 60){
            return true;
        }else if (!(isSummer) && temp >= 60 && temp <=90){
            return true;
        }else {
            return false;
        }


    }
}

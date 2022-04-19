package day34_return_method;

public class CreditScore {
    public static void main(String[] args) {

        getCreditScore(); // this value is not used

        int score = getCreditScore();
        System.out.println(score);

        System.out.println(getCreditScore());
        System.out.println(getCreditScore()+50);
        System.out.println(isGoodCreditScore(680));
        System.out.println(isGoodCreditScore(720));
        System.out.println(isGoodCreditScore(500)? "good": "bad");

    }



    public static int getCreditScore(){
        return 800;
    }
    public static boolean isGoodCreditScore(int creditScore){
        if (creditScore >= 700){
            return true;
        }else{
            return false;
        }
    }


    /* for reference
    public static int getCreditScore(){
        return creditScore >= 700;
    }
     */


}

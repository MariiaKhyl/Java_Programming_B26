package day58_exceptions.bank;

public class NotEnoughMoneyExceptions extends RuntimeException{

    public NotEnoughMoneyExceptions(){
        super("Not Enough money in the account");
    }

    public NotEnoughMoneyExceptions(String msg){
        super(msg);
    }

}

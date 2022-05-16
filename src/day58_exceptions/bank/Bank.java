package day58_exceptions.bank;

public class Bank {

    double balance;
    String username;
    String password;

    public void withdraw(double amountToTakeOut){

        if (amountToTakeOut > balance){
            throw new NotEnoughMoneyExceptions("Balance only have - "+balance);
        }

        balance -=amountToTakeOut;
    }

    public void login(String name,String password) throws InvalidCredentialException{
        if(!username.equals("jamesbond")){
            throw new InvalidCredentialException("Invalid username");
        }

        if(!password.equals("007")){
            throw new InvalidCredentialException("Invalid password");
        }
        System.out.println("LOGIN");

    }



    /*
        if(amountToTakeOut > balance){
            NotEnoughMoneyException e = new NotEnoughMoneyException();
            throw e;
        }
 */
    /*
    double balance;

    public void withdraw(double amountToTakeOut){

        if(amountToTakeOut > balance){
            throw new NotEnoughMoneyException("Balance only has " + balance);
        }

        balance -= amountToTakeOut;

    }

    public void login(String username, String password) throws InvalidCredentialsException{

        if(!username.equals("jamesbond")){
            throw new InvalidCredentialsException("Invalid username");
        }

        if(!password.equals("007")){
            throw new InvalidCredentialsException("Invalid password");
        }

        System.out.println("LOGIN");

    }

}


/*
        if(amountToTakeOut > balance){
            NotEnoughMoneyException e = new NotEnoughMoneyException();
            throw e;
        }
     */


}

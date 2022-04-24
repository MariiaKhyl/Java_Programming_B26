package home_work_day50.discordUser;

public class Student extends DiscordUser {
    /*
    Create a class Admin

    - Admin class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

    - create method:
        createChannel()
            Example output: prints Creating new discord channel
     */
    public Student (String name, int id){
        super("Student", name, id);
    }


    public void createChannel(){
        System.out.println("Creating new discord channel");
    }




}

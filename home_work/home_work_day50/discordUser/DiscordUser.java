package home_work_day50.discordUser;

public class DiscordUser {
    /*
    Create an DiscordUser class

    - create variables:
        role, name, id

    - create constructor to initialize the variables

    - create a toString() method
    */
    String role, name;
    int id;

    public DiscordUser(String role, String name, int id){
        this.role = role;
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return "Discord User \nRole - "+role+"\nName "+name+"\nID "+id;
    }



    /*

Create a class Admin

    - Admin class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Admin, name, id)

    - create method:
        createChannel()
            Example output: prints Creating new discord channel

Create a class Student

    - Student class inherits DiscordUser class

    - create constructor to call parent constructor and set up variables (role - Student, name, id)

    - create method:
        sendMessage()
            Example output: prints Sending message to class chat
     */
}

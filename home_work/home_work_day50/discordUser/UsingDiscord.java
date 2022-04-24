package home_work_day50.discordUser;

public class UsingDiscord {
    public static void main(String[] args) {

        DiscordUser obj = new DiscordUser("Student", "Jerry", 12345);
        obj.id = 32156;
        obj.role = "Admin";
        System.out.println(obj);

        Student obj2 = new Student("Hose", 87654);
        System.out.println(obj2);

        Admin obj3 = new Admin ("Jonny", 4376346);
        System.out.println(obj3);

        obj2.createChannel();
        obj3.createChannel();

    }
}

package home_work_day52.amazon;

public class UseAmazon {
    /*
    create an object of the AmazonAccount and verify the constructor, getters, and setters and toString are working properly
     */
    public static void main(String[] args) {

        AmazonAccount amazon = new AmazonAccount("Mariia Khyl","Mary@gmail.com", false);
        System.out.println(amazon);

     //   System.out.printf(amazon.getUserName());
        amazon.setUserName("James Bond");
        System.out.println(amazon.getUserName());
        amazon.setEmail("JB@gmail.com");
        System.out.println(amazon.getEmail());
        amazon.setHasPrime(true);
        System.out.println(amazon.isHasPrime());

    }
}

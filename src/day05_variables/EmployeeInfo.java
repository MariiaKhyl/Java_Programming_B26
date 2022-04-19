package day05_variables;

public class EmployeeInfo {
    public static void main(String[] args) {

  /*      String firstName = "Mariia";
        String lastName = "Khyl";
        char gender = 'F';
        int age = 29;
        String companyName = "MPG Logistics";
        boolean fullTimeJob = true;
        String jobTitle = "Soft Developer Engineer in Test";
        int salary = 1200;
        int numberOfPto = 12;
        boolean areSheMarried = false;
        char suite = 'C';
        String employeeInfo =""+firstName+" "+lastName+" "+gender+" "+age+" "+companyName+" "+fullTimeJob+" "+jobTitle+" "+salary+" "+numberOfPto+" "+areSheMarried+" "+suite;

        System.out.println(employeeInfo+"\n");
        System.out.println("First and last name - "+firstName+lastName+"\nGender - "+gender+"\nAge - "+age+"\n"+companyName+"\nIs she is full time job? - "+fullTimeJob+"\n"+jobTitle+"\nwhat is the salary? -$"+salary+"\nWhat is the number of the PRO - "+numberOfPto+"\nAre she is married - "+areSheMarried+"\nSuit - "+suite);

   */

       String firstName, lastName, companyName, jobTitle;
       int age, salary, numberOfPto;
       char gender, suite;
       boolean fullTimeJob, isMarried;

       firstName = "James";
       lastName = " Bond";
       gender = 'M';
       age = 33;
       companyName = "M16";
       jobTitle = "Special Agent";
       fullTimeJob = true;
       salary = 1_000_000;
       isMarried = false;
       suite = 'D';
       numberOfPto = 15;


       String fullDetails = "Employment info for "+firstName+""+lastName+"\nGender - "+gender+ "\n"+jobTitle+" at "+companyName+ " currently "+age+ " years old.\n"+companyName+" is located in suite "+ suite+ ". This year salary comes to $"+salary+ ".\nOther details: PTO"+ numberOfPto+";\nFull time? "+fullTimeJob+"; \nMarried? - "+isMarried;
        System.out.println(fullDetails);




    }
}

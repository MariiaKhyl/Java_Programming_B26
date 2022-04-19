package day07_unary_operators;

public class SalaryCalculator {

    public static void main(String[] args) {

        double salary = 100_000;
        double stateTaxRate = 0.08; // 8%
        double federalTaxRate = 0.21; // 21%
        double stateTax, federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;
        String taxReport = "State tax rate:\t\t"+stateTaxRate+";\nFederal tax rate:\t"+federalTaxRate+";\nSalary:\t\t\t\t$"+salary+"\nTax amount:\t\t\t$"+stateTax+"\nState tax and "+federalTax +" for a total of " +totalTax+ "\nAfter tax your salary is - $" +salaryAfterTax;
        System.out.println(taxReport);




    }
}

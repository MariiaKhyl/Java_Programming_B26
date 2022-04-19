package home_work_day06;

public class SalaryCalculation {
    public static void main(String[] args) {
        int salary = 1_250_30;
        double stateTaxRate = 7.22;
        double federalTaxRate = 18.47;


        double stateTax = salary * stateTaxRate;
        double federalTax = salary * federalTaxRate;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salary - totalTax;
        System.out.println("\tState tax rate - " +stateTaxRate+"\n\tFederal tax rate - "+federalTaxRate+"\n\tMy total salary - "+salary+"\n\tThe state tax amount - "+stateTax+"\n\tThe amount of tax of federal - "+federalTax+"\n\tThe total tax amount - "+totalTax+"\n\tMy salary after tax is "+salaryAfterTax);

        /*
        stateTax = (salary/100)*stateTaxRate;
        federalTax = (salary/100)*federalTaxRate;
        totalTax = stateTax + federalTax;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;


         */







    }
}

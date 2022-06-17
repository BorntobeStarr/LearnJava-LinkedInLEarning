import java.util.Scanner;

public class Main {

    public static double calculateAnnualSalary (double hoursPerWeek, double amountPerHour, double vacationDays ) {

        double weeklyPay = hoursPerWeek * amountPerHour;
        double yearlySalary = weeklyPay * 52;
        double accountingForVacationDays = (vacationDays * 8) *amountPerHour;
        double grossSalary =  yearlySalary - accountingForVacationDays;
        return grossSalary;
    }



    public static void main(String[] args) {
        double myGrossSalary = calculateAnnualSalary(40, 10, 10);
        System.out.println("Your gross salary including vacation days is $" + myGrossSalary );

    }
}
package org.challenge1;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hiredDate, double annualSalary) {
        super(name, birthDate, hiredDate);
        this.annualSalary = annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;

        return (isRetired) ? 0.9 * paycheck : paycheck;
    }

    public void retire() {

        terminate("12/12/2025");
        isRetired = true;
    }

}

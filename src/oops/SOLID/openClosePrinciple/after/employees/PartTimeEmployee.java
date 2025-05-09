package oops.SOLID.openClosePrinciple.after.employees;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }

    @Override
    public double calculate(Employee employee) {
        return (double) (employee.getMonthlyIncome() * 20) / 100 +
                (double) (employee.getMonthlyIncome() * 3) / 100 +
                (double) (employee.getMonthlyIncome()) / 100;
    }
}
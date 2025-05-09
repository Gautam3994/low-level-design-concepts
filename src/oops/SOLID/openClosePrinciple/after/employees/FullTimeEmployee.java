package oops.SOLID.openClosePrinciple.after.employees;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

    @Override
    public double calculate(Employee employee) {
        return (double) (employee.getMonthlyIncome() * 30) / 100 +
                (double) (employee.getMonthlyIncome()) / 100 +
                (double) (employee.getMonthlyIncome()) / 100;
    }
}

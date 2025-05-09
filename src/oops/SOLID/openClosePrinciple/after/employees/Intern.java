package oops.SOLID.openClosePrinciple.after.employees;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

    @Override
    public double calculate(Employee employee) {
        return (double) (employee.getMonthlyIncome() * 20) / 100 +
                (double) (employee.getMonthlyIncome() * 3) / 100 +
                (double) (employee.getMonthlyIncome()) / 100;
    }
}

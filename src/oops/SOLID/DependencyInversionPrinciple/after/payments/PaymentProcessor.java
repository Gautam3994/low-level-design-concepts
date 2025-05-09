package oops.SOLID.DependencyInversionPrinciple.after.payments;

import oops.SOLID.DependencyInversionPrinciple.after.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.after.notification.EmailSender;
import oops.SOLID.DependencyInversionPrinciple.after.repositories.EmployeeFileRepository;

import java.util.List;

public class PaymentProcessor {

    EmployeeFileRepository employeeFileRepository;

    public PaymentProcessor(EmployeeFileRepository employeeFileRepository) {
        this.employeeFileRepository  = employeeFileRepository;
    }

    public int sendPayments(){

        List<Employee> employees = employeeFileRepository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            EmailSender.notify(employee);
        }

        return totalPayments;
    }
}

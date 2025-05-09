package oops.SOLID.DependencyInversionPrinciple.after.main;

import oops.SOLID.DependencyInversionPrinciple.after.payments.PaymentProcessor;
import oops.SOLID.DependencyInversionPrinciple.after.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.after.serielizer.EmployeeFileSerializer;

public class PayEmployeesMain {

    public static void main(String[] args) {
        EmployeeFileSerializer serializer = new EmployeeFileSerializer();
        EmployeeFileRepository employeeRepository = new EmployeeFileRepository(serializer);
        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeRepository);
        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}

package oops.SOLID.singleResponsibilityPrinciple.afterChange;

public class Email {
    public String getEmail(Employee employee) {
        return employee.getFirstName() + "." +
                employee.getLastName() +
                "@globomanticshr.com";
    }
}
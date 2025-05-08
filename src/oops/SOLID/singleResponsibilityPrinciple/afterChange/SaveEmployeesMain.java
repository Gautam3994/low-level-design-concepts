package oops.SOLID.singleResponsibilityPrinciple.afterChange;

import java.util.List;

public class SaveEmployeesMain {
    private static final Save save = new Save();
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<oops.SOLID.singleResponsibilityPrinciple.afterChange.Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
           save.save(e);
        }
    }
}
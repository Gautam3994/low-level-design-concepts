package oops.SOLID.singleResponsibilityPrinciple.afterChange;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Save {

    private final Email email = new Email();
    public  void save(Employee employee){
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("### EMPLOYEE RECORD ####");
            sb.append(System.lineSeparator());
            sb.append("NAME: ");
            sb.append(employee.getFirstName() + " " + employee.getLastName());
            sb.append(System.lineSeparator());
            sb.append("POSITION: ");
            sb.append(employee.getClass().getTypeName());
            sb.append(System.lineSeparator());
            sb.append("EMAIL: ");
            sb.append(email.getEmail(employee));
            sb.append(System.lineSeparator());
            sb.append("MONTHLY WAGE: ");
            sb.append(employee.getMonthlyIncome());
            sb.append(System.lineSeparator());

            Path path = Paths.get(employee.getFullName()
                    .replace(" ","_") + ".rec");
            Files.write(path, sb.toString().getBytes());

            System.out.println("Saved employee " + employee);
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}
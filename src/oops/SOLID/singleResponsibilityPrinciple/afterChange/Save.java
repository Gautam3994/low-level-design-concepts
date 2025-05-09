package oops.SOLID.singleResponsibilityPrinciple.afterChange;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Save {

   private final EmployeeFileSerializer employeeFileSerializer = new EmployeeFileSerializer();
    public  void save(Employee employee){
        try {
            StringBuilder sb = employeeFileSerializer.serialize(employee);
            Path path = Paths.get(employee.getFullName()
                    .replace(" ","_") + ".rec");
            Files.write(path, sb.toString().getBytes());

            System.out.println("Saved employee " + employee);
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}
package oops.SOLID.singleResponsibilityPrinciple.afterChange;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public List<oops.SOLID.singleResponsibilityPrinciple.afterChange.Employee> findAll(){

        // Employees are kept in memory for simplicity
        oops.SOLID.singleResponsibilityPrinciple.afterChange.Employee anna = new oops.SOLID.singleResponsibilityPrinciple.afterChange.FullTimeEmployee("Anna Smith", 2000);
        oops.SOLID.singleResponsibilityPrinciple.afterChange.Employee billy = new FullTimeEmployee("Billy Leech", 920);

        oops.SOLID.singleResponsibilityPrinciple.afterChange.Employee steve = new oops.SOLID.singleResponsibilityPrinciple.afterChange.PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }
}
package oops.SOLID.DependencyInversionPrinciple.after.notification;


import oops.SOLID.DependencyInversionPrinciple.after.employees.Employee;

/*
Email sender; To make it work you need to supply correct mail
server data; The current configuration properties will not be
valid.
 */
public class EmailSender {
    public static void notify(Employee employee){
    	//Configure and send mail here
    	System.out.println("Sending mail to "+employee.getEmail());
    	System.out.println("Mail sent to "+employee.getEmail());
}
}

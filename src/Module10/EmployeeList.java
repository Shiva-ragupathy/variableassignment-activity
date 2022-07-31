package Module10;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        Employee employee1 = new Employee("projectManager", 1600,"WayneEnterprise");
        Employee employee2 = new Employee("Reporter", 1600,"DailyPlanet");
        Employee employee3 = new Employee("ForensicScientist", 3500,"StarCity");
        Employee employee4 = new Employee("BarManager", 1400,"Verdict");
        Employee employee5 = new Employee("Tester", 1600,"WayneEnterpriseSolutions");

        employee1.setName("OliverQueen");
        employee2.setName("ClarkeKent");
        employee3.setName("BarryAllen");
        employee4.setName("Artur");
        employee5.setName("Shiva");

        List<Employee> empList = new ArrayList<Employee>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);

        Employee obj = new Employee();
        System.out.println("The Employee whose salary is the highest is "+obj.getHighestPaidEmp(empList));
    }
}

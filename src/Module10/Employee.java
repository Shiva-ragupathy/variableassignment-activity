package Module10;

import java.util.List;

public class Employee extends Person {

    private String company;
    private double salary;
    private String title;

    public Employee(String company, double salary, String title) {
        this.company = company;
        this.salary = salary;
        this.title = title;
    }

    public Employee() {
        this.company = "Access health care";
        this.salary = 800;
        this.title = "developer";
        System.out.println("I am from company" + company + " and my salary is" + salary);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Override method introduce of person class ->
    //"My name is <name> and i am <age> years old
    //I am work as <jobTitle> in <company>“ and my salary is <salary>


    @Override
    public void personIntroduce() {
        System.out.println("My name is " + getName() + " and I am " + getAge() + " years old");
        System.out.println("I am working as " + getTitle() + " in " + getCompany() + " and my salary is " + getSalary());
    }

public double getHighestPaidEmp(List<Employee> empList) {
    double largest = 0;
    for (int i = 0; i <empList.size();i++) {
        if(empList.get(i).getSalary() > largest) {
            largest = empList.get(i).getSalary();
        }

    }
   return largest;
    }


}







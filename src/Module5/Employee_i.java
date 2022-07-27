package Module5;

public class Employee_i  extends Person_I {
    //Attributes
    private double salary;
    private String title;

    //Behavior
    public Employee_i() {
        System.out.println("I'm an Employee_I Constructor");
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

}


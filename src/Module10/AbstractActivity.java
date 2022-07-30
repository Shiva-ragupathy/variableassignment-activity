package Module10;

public class AbstractActivity {
    public static void main(String[] args) {

        Employee employee1= new Employee();
        employee1.setName("Shiva");
        employee1.setAge(26);
        employee1.setTitle("developer");
        employee1.setCompany("Accenture");
        employee1.personIntroduce();

        Students students1= new Students();
        students1.setSchoolName("Riga Technical university");
        students1.personIntroduce();

    }
}

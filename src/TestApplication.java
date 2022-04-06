import java.util.Arrays;

public class TestApplication {

    public TestApplication() {
    }

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setAge(20);
        int age = emp.getAge();
        System.out.println("Current Age: "+age);
        int ageAfter20Years = emp.getAgeAfter20YearsOnCurrentAge();
        System.out.println("Age after 20 years: "+ageAfter20Years);

        Employee emp1 = new Employee("Ravi","Kumar",200000,28);
        age = emp1.getAge();
        System.out.println("Current Age: "+age);
        ageAfter20Years = emp1.getAgeAfter20YearsOnCurrentAge();
        System.out.println("Age after 20 years: "+ageAfter20Years);
        System.out.println("department name without setting department: "+emp1.getDepartment());

        Department department = new Department(1,"Engineering");
        Employee emp2 = new Employee("Ravi","Kumar",200000,28,department);

        System.out.println("department name:: "+emp2.getDepartment().getDeptName());
        System.out.println("department Id:: "+emp2.getDepartment().getDeptId());
    }
}

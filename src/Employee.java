public class Employee {
    private String firstName; //null -default value
    private String lastName;  //null
    private double salary;    //0.0
    private int age;          //0
    private Department department;

    Employee() {}
    public Employee(String firstName, String lastName, double salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }
    public Employee(String firstName, String lastName, double salary, int age, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName; }
    public double getSalary() {return salary;}
    public int getAge() {return age;}

    public Department getDepartment() {
        return department;
    }

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setAge(int age) {this.age = age;}

    public int getAgeAfter20YearsOnCurrentAge() {
        int currentAge = getAge();
        return currentAge + 20;
    }


}

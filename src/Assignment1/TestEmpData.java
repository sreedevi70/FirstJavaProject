package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class TestEmpData {
    public static void main(String[] args) {

        int noOfMaleEmployees = 0;
        int noOfFemaleEmployees = 0;
        int sumOfMaleAge=0, sumOfFemaleAge = 0;
       // int avgMaleAge=0, avgFemaleAge =0;

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111,"Jiya Brein",32,"Female","HR",2011,25000.0));
        employeeList.add(new Employee(122,"Pau Niksui",25,"Male","Sales and Marketing",2015,13500.0));
        employeeList.add(new Employee(133,"Martin Theorn",29,"Male","Infrastructure",2012,18000.0));
        employeeList.add(new Employee(144,"Murali Gowda",28,"Male","Product Development",2014,32500.0));
        employeeList.add(new Employee(155,"Nima Roy",27,"Female","HR",2013,22700.0));;
        employeeList.add(new Employee(166,"Iqbal Hussain",43,"Male","Security and Transport",2016,10500.0));;
        employeeList.add(new Employee(177,"Manu Sharma",35,"Male","Account and Finance",2010,27000.0));
        employeeList.add(new Employee(188,"Wang Liu",31,"Male","Product Development",2015,34500.0));
        employeeList.add(new Employee(199,"Amelia Zoe",24,"Female","Sales and Marketing",2016,11500.0));
        employeeList.add(new Employee(200,"Jaden Dough",38,"Male","Security and Transport",2015,11000.5));
        employeeList.add(new Employee(211,"Jasna Kaur",27,"Female","Infrastructure",2014,15700.0));
        employeeList.add(new Employee(222,"Nitin Joshi",25,"Male","Product Development",2016,28200.0));
        employeeList.add(new Employee(233,"Jyothi Reddy",27,"Female","Account and Finance",2013,21300.0));
        employeeList.add(new Employee(244,"Nicolus Den",24,"Male","Sales and Marketing",2017,10700.5));
        employeeList.add(new Employee(255,"Ali Baig",23,"Male","Infrastructure",2018,12700.0));
        employeeList.add(new Employee(266,"Sanvi Pandey",26,"Female","Product Development",2015,28900.0));
        employeeList.add(new Employee(277,"Anuj Chettair",31,"Male","Product Development",2012,35700.0));


        for (Employee count: employeeList
             ) {
            if(count.gender != "Null") {
                if (count.gender == "Male") {
                    noOfMaleEmployees++;
                    sumOfMaleAge = sumOfMaleAge+ count.age;
                }
                else {
                    noOfFemaleEmployees++;
                    sumOfFemaleAge = sumOfFemaleAge+ count.age;
                }
            }
        }
        System.out.println("No of Male Employees : "+noOfMaleEmployees);
        System.out.println("No of Male Employees : "+noOfFemaleEmployees);
        System.out.println("Average age of Male Employees : "+(sumOfMaleAge/noOfMaleEmployees));
        System.out.println("Average age of Female Employees : "+(sumOfFemaleAge/noOfFemaleEmployees));

    }
}

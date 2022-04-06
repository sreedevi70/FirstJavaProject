package Inheritance.singleInheritance;

public class SingleInheritanceTest {
    public static void main(String[] args) {
        Car car = new Car();

        car.setTypeOfVehicle("4 wheeler");
        car.setColor("blue");
        car.setBrand("scoda");
        car.setName("XYZ");
        car.setNoOfTyres(4);

        car.displayVehicleInfo();
        car.displayCarInfo();
    }
}

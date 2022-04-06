package Inheritance.singleInheritance;

public class Vehicle {
    private String typeOfVehicle;
    private int noOfTyres;

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }
    public void displayVehicleInfo(){
        System.out.println("Type of Vehicle: "+typeOfVehicle);
        System.out.println("No. of Tyres: "+noOfTyres);
    }
}

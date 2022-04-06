package Inheritance.singleInheritance;

public class Car extends Vehicle{

    private String color;
    private String brand;
    private String name;

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public String getBrand() {
        return brand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void displayCarInfo(){
        System.out.println("Car color: "+color);
        System.out.println("brand name: "+brand);
        System.out.println("car name:"+name);
    }


}

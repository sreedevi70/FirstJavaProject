package Inheritance;

public class Dog extends Animal{
    public void displayName(){
        System.out.println("Name of the animal is.."+getName());
    }

    public void displayTypeOfShout(){
        System.out.println("The Dog "+getName()+" "+getTypeOfShout()+" bow bow");
    }

}

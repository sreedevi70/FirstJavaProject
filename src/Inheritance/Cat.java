package Inheritance;

public class Cat extends Animal{

    public void displayName(){
        System.out.println("name of the animal is :: "+getName());
    }

    public void displayTypeOfShout(){
        System.out.println("The Cat "+getName()+" "+getTypeOfShout()+" mee mee");
    }

}

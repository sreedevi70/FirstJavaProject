package Inheritance.multilevelInheritance;

public class TestMultipleInheritance {
    public static void main(String[] args) {
        Father father = new Father();
        father.getNameOfClass1();
        father.getNameOfClass2();

        Child child = new Child();
        child.getNameOfClass1();
        child.getNameOfClass2();
        child.getNameOfClass3();
    }
}

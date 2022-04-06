package Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Bruno");
        dog.displayName();
        dog.eat();
        dog.setTypeOfShout("barks");
        dog.displayTypeOfShout();

        Cat cat = new Cat();
        cat.setName("billi");
        cat.displayName();
        cat.eat();
        cat.setTypeOfShout("meows");
        cat.displayTypeOfShout();
    }
}

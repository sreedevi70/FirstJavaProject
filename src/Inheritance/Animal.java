package Inheritance;

public class Animal {

    private String name;
    private String typeOfShout;

    public void eat(){
        System.out.println("Now "+name+" is eating..");
    }

    public String getName() {
        return name;
    }

    public String getTypeOfShout() {
        return typeOfShout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfShout(String typeOfShout) {
        this.typeOfShout = typeOfShout;
    }
}

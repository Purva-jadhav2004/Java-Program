package utility;

import utility.CapitalString;

public class Person {
    String name;
    String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void display() {
        CapitalString cs = new CapitalString();
        String capitalizedName = cs.capitalizeFirstLetter(name);
        System.out.println("Name: " + capitalizedName + ", City: " + city);
    }

    public static void main(String[] args) {
        Person p = new Person("john", "pune");
        p.display();
    }
}
package org.fasttrackit;


public class Constructors {

    String name;
    int age;
    int weight;

//      Constructor parametrizat
//    public Constructors(String name, int age, int weight) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;

//    }
//
//    public static void main(String[] args) {
//
//        Constructors constructor = new Constructors("Muhammad Ali", 28, 98);
//        System.out.println("When " + constructor.name + " fought Joe Frazier in 1970, he was " + constructor.age + " years old and weighted " + constructor.weight + " Kgs.");
//
//    }

    // Constructor non-argument, fara parametrii intre paranteze
    private Constructors ()
    {
        name= "Muhammad Ali";
        age = 28;
        weight = 98;
        System.out.println("Constructor non-argument:");
    }

    public static void main(String[] args) {
        Constructors constructor = new Constructors();
        System.out.println(constructor.name + " " + constructor.age + " " + constructor.weight);

    }
}

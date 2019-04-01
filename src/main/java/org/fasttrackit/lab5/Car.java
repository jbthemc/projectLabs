package org.fasttrackit.lab5;

public class Car {

    public static int nrOfCars=0;

    private String name;
    private String model;
    private int power;
    private Roata roataSpateStanga = new Roata();
    private Roata roataSpateDreapta;
    private Roata roataFataStanga;
    private Roata roataFataDreapta;

    private int nrOfWheels;
    private int nrOfChairs;

    public Car (){
        System.out.println("Constructor called");
        nrOfCars++;
        roataSpateDreapta = new Roata();
        roataFataStanga = new Roata();
        roataFataDreapta = new Roata();

        // shift + F6 = rename variables;
    }

    public Car (String name, String model){ // constructor cu parametri
        this();
        this.name = name;
        this.model = model;
//        nrOfCars++;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void run(){
        System.out.println("The Car " +name + " is running!");
    }

    public void transportPeople(){
        System.out.println("I'm a bus, I can carry more people ");
    }

}
package org.fasttrackit.lab5;

public class Camion extends Car {

    private String bena;
    private int tonaj;

    public Camion() {
        super();
        bena = "bena";

    }
    public Camion(String name, String model) {
        super (name, model);
    }

    public void transporMarfa(){
        System.out.println("Sunt camion, eu transport marfa");
    }
}

package org.fasttrackit.lab5;

public class CarApplication {
    public static void main(String[] args) {
        Car carMercedes = new Car();
        carMercedes.setName("Mercedes");
        carMercedes.setModel("G class");

        Car carFord = new Car();
        carFord.setName("Ford");
        carFord.setModel("Focus");

        Car carAudi = new Car();
        carAudi.setName("Audi");
        carAudi.setModel("Q7");

        carMercedes.run();
        carAudi.run();
        carFord.run();

        Car volvo = new Car("Volvo", "s90");

        volvo.run();
//        System.out.println("Masina creata prin noul constructor este: " + volvo);

        Autobuz myBus = new Autobuz();
        myBus.setModel("bus model");
        myBus.setName("bus name");
        myBus.oomposteazaBilet();

        Camion truck = new Camion();
        truck.setModel("camion model");
        truck.setName("camion nume");
        truck.transporMarfa();

        Camion truck2 = new Camion("Camion", "Model");
        truck2.run();


        // Agregare ->  contine
        // Asociere -> este /is
        // Composition -> are

        System.out.println("We have created " + Car.nrOfCars + " cars");
//        System.out.println("We have created " + carFord.nrOfCars + " cars");

        // Ce e static putem apela pe o clasa, ce e non-static apelam pe o instanta a clasei
    }
}

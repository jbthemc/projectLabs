package org.fasttrackit.lab5Magazin;

public class MagazinApplication {
    public static void main(String[] args) {

        CatalogDeProduse catalog = new CatalogDeProduse();

        Produs productOne = new Produs();
        Produs productTwo = new Produs();
        productOne.setName("paine");
        productTwo.setName("lapte");

        catalog.addProduct(productOne);
        catalog.addProduct(productTwo);

        System.out.println("Magazinul are acest nr de produse: " + catalog.getNrOfProduct());
    }
}

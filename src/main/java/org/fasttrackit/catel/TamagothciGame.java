package org.fasttrackit.catel;

public class TamagothciGame {
    public static void main(String[] args) {

        Catel dog1 = new Catel();
        dog1.setName("Rex");

        Catel dog2 = new Catel();
        dog2.setName("Azorica");

        for (int zi=0;zi<15;zi++) {
            dog2.mananca(15);
        }
        System.out.println("Catelul " + dog2.getName() + " are varsta: " + dog2.getVarsta());
    }
}

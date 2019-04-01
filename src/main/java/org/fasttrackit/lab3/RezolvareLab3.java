package org.fasttrackit.lab3;

import java.util.Scanner;

public class RezolvareLab3 {
    public static void main(String[] args) {
        /* 1.	Sa se calculeze medie aritmetica a doua numere pozitive citite de la tastatura.
         */
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        float nr1 = consoleInput.nextFloat();
        System.out.println("Introduceti al doilea numar: ");
        float nr2 = consoleInput.nextFloat();
        float medie = (nr1+nr2)/2;
        if (nr1>0 && nr2>0) {
            System.out.println("Media aritmetica a celor 2 numere este: " + medie);
        }
        else {
            System.out.println("Numerele nu sunt pozitive");
        }

        /* 7. Se da un numar a. Se se afiseze numarul invers
            de ex
            int a = 476
            se va obtine
            int invers =674
         */
        System.out.println("Introduceti un numar pe care doriti sa il inversati: ");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Numarul invers este: " + reverse);

    }
}

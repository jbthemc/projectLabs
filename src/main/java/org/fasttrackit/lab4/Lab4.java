package org.fasttrackit.lab4;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        float medie = calculMedieAritmetica();
        System.out.println("Media aritmetica este: " + medie);
    }
        private static float calculMedieAritmetica() {
            Scanner sc = new Scanner(System.in);
            int suma = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("Introduceti un numar: ");
                suma += sc.nextInt();
            }
            return (float) suma / 3;
        }
}

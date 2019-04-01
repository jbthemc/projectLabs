package org.fasttrackit.lab4;

import java.util.Scanner;

public class RezolvareLab4 {
    public static void main(String[] args) {
//        2.	Sa se calculeze media aritmetica a N numere pozitive citite de la tastatura.

        Scanner sc = new Scanner(System.in);
        float sum = 0;
        int n = 0;

        System.out.println("How many numbers you want for aritmethic mean:");
        int nr=sc.nextInt();

        for(int i=0;i<nr;i++){
            System.out.println("Please type a number:");
            sum+=sc.nextFloat();
            n++;
        }

        float mean =sum/n;
        System.out.println("The aritmethic mean is: " + mean);

//        4.	Sa se genereze o tabla a inmultirii cu N, unde N este citit de la tastatura, de ex tabla inmultirii cu 5
//        0x5=0
//        1x5=5
//        2x5=10
//….
//        10x5=50

        System.out.println("Tell me a number and I will tell you the multiplication table");

        int N = sc.nextInt();
        for (int i=0;i<=10;i++) {
            //int multiplication = N * i;
            System.out.println(N +" * "+i+" = "+N*i);
            n++;
        }
    }
}
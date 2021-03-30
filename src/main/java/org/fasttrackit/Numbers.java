package org.fasttrackit;

import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr(1)= ");
        int number = scanner.nextInt();  // cin>>


//        int[] numbers = new int[number];
        int m = 0;

        if (number == 1 || number == 2 || number == 3)
            System.out.println(number + " este numar prim.");

        if (number > 3) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    m++;
            }
            if (m > 0)
                System.out.println(number + " nu este numar prim.");
            else if (m == 0)
                System.out.println(number + " este numar prim.");
        }

        System.out.println("Nr(2)= ");
        int N = scanner.nextInt();
        System.out.println("Numerele prime pana la " + N + " sunt: ");


        for (int i = 1; i < N; i++) {
           prim(i);
        }


    }

    private static void prim(int a) {
        int k = 0;
        if (a == 1 || a == 2 || a == 3)
            System.out.print(a + " ");

        if (a > 3) {
            for (int i = 2; i < a; i++) {
                if (a % i == 0)
                    k++;
            }
            if (k == 0)
                System.out.print(a + " ");
        }

    }
}

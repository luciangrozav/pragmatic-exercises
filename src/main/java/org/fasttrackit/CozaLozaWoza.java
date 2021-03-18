package org.fasttrackit;

public class CozaLozaWoza {

    public static void main(String[] args) {  // execut direct din aceasta metoda

        for (int i = 1; i <= 110; i++) {
            if (i % 11 != 0)
                System.out.print(i + " ");
            if (i % 11 == 0)
                System.out.println(i + " ");
        }
        System.out.println();

        System.out.println("Logica cu for classic si if: \n");
        for (int i = 1; i <= 110; i++) {
            if (i % 11 != 0) {
                if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) System.out.print("CozaLozaWoza" + " ");
                else if (i % 3 == 0 && i % 5 == 0) System.out.print("CozaLoza" + " ");
                else if (i % 3 == 0 && i % 7 == 0) System.out.print("CozaWoza" + " ");
                else if (i % 5 == 0 && i % 7 == 0) System.out.print("LozaWoza" + " ");
                else if (i % 3 == 0) System.out.print("Coza" + " ");
                else if (i % 5 == 0) System.out.print("Loza" + " ");
                else if (i % 7 == 0) System.out.print("Woza" + " ");

                else System.out.print(i + " ");
            }

            if (i % 11 == 0) {
                if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) System.out.println("CozaLozaWoza" + " ");
                else if (i % 3 == 0 && i % 5 == 0) System.out.println("CozaLoza" + " ");
                else if (i % 3 == 0 && i % 7 == 0) System.out.println("CozaWoza" + " ");
                else if (i % 5 == 0 && i % 7 == 0) System.out.println("LozaWoza" + " ");
                else if (i % 3 == 0) System.out.println("Coza" + " ");
                else if (i % 5 == 0) System.out.println("Loza" + " ");
                else if (i % 7 == 0) System.out.println("Woza" + " ");

                else System.out.println(i + " ");
            }
        }




    }

}

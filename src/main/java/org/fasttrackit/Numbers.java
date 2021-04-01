package org.fasttrackit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nr(1)= ");
        int number = scanner.nextInt();  // cin>>
        if (!(number>0))
            throw new RuntimeException("Please enter only positive numbers.");
//        try
//        {
//
//           String s = "hello";
//            number = Integer.parseInt(s);
//
//        } catch (NumberFormatException n)
//        {
//            System.out.println("INVALID- You have entered a character.");
//        }

        int m = 0;
        int k=0;

        if (number == 1 || number == 2 || number == 3)
            System.out.println(number + " este numar prim.");

        if (number > 3) {
            for (int i = 2; i < number/2; i++) {
                if (number % i == 0)
                    m++;
            }
            if (m > 0)
                System.out.println(number + " nu este numar prim.");
            else if (m == 0)
                System.out.println(number + " este numar prim.");
        }

        System.out.println("Nr(2)= ");
        long N = scanner.nextLong();
        if(!(N >0))
            throw new RuntimeException("Please enter only positive numbers.");

        System.out.println("Numerele prime pana la " + N + " sunt: ");


        for (int i = 1; i < N; i++) {
            prim(i);
        }

        System.out.println(" ");
        System.out.println("Numerele perfecte pana la " + N + " sunt: ");


        for (int i = 1; i < N; i++) {
            perfect(i);
        }

        System.out.println("\nPlease enter the length of the array: ");
        int L = scanner.nextInt();
        int[] array = new int[L];
        for(int i=0; i<L; i++)
        {
            System.out.println("a[" + i + "]= ");
            array[i]= scanner.nextInt();
        }
        System.out.println("Afisare:");
        for(int i=0; i<L; i++)
            System.out.print(array[i] + " ");
        System.out.println("\nAfisare in ordine crescatoare: ");
        for (int i=0; i<L; i++)
        {
            for (int j=i+1; j<L; j++)
                if(array[i] >= array[j])
                {
                    k=array[i];
                    array[i] = array[j];
                    array[j]=k;
                }
        }
        for(int i=0; i<L; i++)
            System.out.print(array[i] + " ");
        System.out.println("\nAfisare in ordine descrescatoare: ");
        for (int i=0; i<L; i++)
        {
            for (int j=i+1; j<L; j++)
                if(array[i] <= array[j])
                {
                    k=array[i];
                    array[i] = array[j];
                    array[j]=k;
                }
        }
        for(int i=0; i<L; i++)
            System.out.print(array[i] + " ");

    }


        private static void prim ( int a){
            long k = 0;
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

        private static void perfect (int a)
        {
            int[] array = new int[a];
            int k=0;
            int s=0;
            for(int i=1; i<a; i++)
            {
                if(a%i==0)
                    array[k++]=i;
            }

            for(int i=0; i< array.length; i++)
                s+=array[i];

            if(a ==s)
                System.out.print(a + " ");
        }

}

package org.fasttrackit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArrayValidator {

    public static String validateArray(int[] numbers)  // declarata static- pt a s putea folosi in psvm (care este statica)
    {

        for(int k=0; k< numbers.length; k++)
            for(int x= k+1; x < numbers.length; x++)
            {
                if(numbers[k] < numbers[x]) // Pasul 1 logic- compari numerele
                {
                    for(int y=x+1; y< numbers.length; y++)
                    {
                        if(numbers[k] > numbers[y])  // Pasul 2 logic- analizezi numerele de dupa (conform cerintei)
                            return "INVALID";
                    }
                }

            }

        return "VALID";
    }

    // preorder traversals in BST (binary search tree)
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(Paths.get("src/main/java/org/fasttrackit/Exercitiu-2.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("src/main/java/org/fasttrackit/Exercitiu-2-output.txt", true)  // true- pt a nu se suprascrie in fisier
        );

       // value of T
        int testCasesCount = scanner.nextInt();

        if(testCasesCount <1 || testCasesCount >10)
            throw new RuntimeException("Invalid test cases number received.");

        // processing each test case
        for(int i=1; i<=testCasesCount; i++) {
            // value of N
            int arrayLength = scanner.nextInt(); //citesti

            if (arrayLength < 1)
                throw new RuntimeException("Invalid array length received.");

            //array A
            int[] numbers = new int[arrayLength]; // declari

            // reading numbers for one test case
            for(int j=0; j < numbers.length; j++) {
                int number = scanner.nextInt(); // citesti nr din lista
                if(number <1 || number >100)
                    throw new RuntimeException("Invalid value of number received.");
                numbers[j] = number; // adaugi nr in lista numbers
            }

            String result = validateArray(numbers);

            String outputline = "CASE #" + i + ": " + result;
            bufferedWriter.write(outputline); // cout
            bufferedWriter.newLine();

        }
        scanner.close();
        bufferedWriter.close();

    }
}

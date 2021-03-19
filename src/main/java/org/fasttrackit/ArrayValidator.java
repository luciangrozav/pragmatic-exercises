package org.fasttrackit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ArrayValidator {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(Paths.get("src/main/java/org/fasttrackit/Exercitiu-2.txt"));

        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("src/main/java/org/fasttrackit/Exercitiu-2-output.txt")
        );

       // value of T
        int testCasesCount = scanner.nextInt();

        // processing each test case
        for(int i=1; i<=testCasesCount; i++) {
            // value of N
            int arrayLength = scanner.nextInt(); //citesti

            //array A
            int[] numbers = new int[arrayLength]; // declari

            // reading numbers for one test case
            for(int j=0; j < numbers.length; j++) {
                int number = scanner.nextInt(); // citesti nr din lista
                numbers[j] = number; // adaugi nr in lista numbers
            }

            String result = "VALID";

            String outputline = "CASE #" + i + ": " + result;
            bufferedWriter.write(outputline); // cout
            bufferedWriter.newLine();

        }
        scanner.close();
        bufferedWriter.close();

    }
}

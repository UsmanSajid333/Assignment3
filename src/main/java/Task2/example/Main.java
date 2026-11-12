package Task2.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenTotal = 0;
        int oddTotal = 0;
        int numbers;

        System.out.println("Enter integer numbers (0 to stop):");

        while ((numbers = input.nextInt()) != 0) {
            if (numbers % 2 == 0) {
                evenTotal++;
            } else {
                oddTotal++;
            }
        }

        System.out.println("Even numbers: " + evenTotal);
        System.out.println("Odd numbers: " + oddTotal);
    }
}
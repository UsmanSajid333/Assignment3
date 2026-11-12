package Task1.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("p = ");
        int p = sc.nextInt();
        System.out.print("s = ");
        int s = sc.nextInt();
        System.out.print("m = ");
        int m = sc.nextInt();

        if (s < p && m <= 0) {
            System.out.println("The student can never afford the laptop.");
            return;
        }

        int total = s;
        int k = 0;

        while (total < p) {
            total += m;
            k++;
        }

        System.out.println("k = " + k);
    }
}

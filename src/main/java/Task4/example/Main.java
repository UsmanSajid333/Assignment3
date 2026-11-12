package Task4.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("duomenys.txt"));

        int previous = sc.nextInt();
        int count = 0;

        while (sc.hasNextInt()) {
            int current = sc.nextInt();
            if (current < previous) {
                count++;
            }
            previous = current;
        }

        System.out.println(count);
    }
}
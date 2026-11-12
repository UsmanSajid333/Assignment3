package Task3.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("duomenys.txt"));

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            if (t < 0) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No negative temperatures recorded");
        } else {
            System.out.println(count);
        }
    }
}
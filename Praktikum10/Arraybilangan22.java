package Praktikum10;

import java.util.Scanner;

public class Arraybilangan22 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int [] bil = new int [4];
        bil [0] = 5;
        bil [1] = 13;
        bil [2] = -7;
        bil [3] = 17;

        System.out.println(bil[0]);
        System.out.println(bil[1]);
        System.out.println(bil[2]);
        System.out.println(bil[3]);

        sc.close();

    }
}

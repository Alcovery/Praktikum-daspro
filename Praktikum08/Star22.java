package Praktikum08;

import java.util.Scanner;

public class Star22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            System.out.print("*");
        }
        sc.close();
    }
}
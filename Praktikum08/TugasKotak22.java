package Praktikum08;

import java.util.Scanner;

public class TugasKotak22 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N (N >= 3): ");
        int N = scanner.nextInt();

        if (N < 3) {
            System.out.println("N must be at least 3.");
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.print("5 ");
                } else {
                    System.out.print("3 ");
                }
            }
            System.out.println();
        }
    }
}


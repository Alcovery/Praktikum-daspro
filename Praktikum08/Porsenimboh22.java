package Praktikum08;

import java.util.Scanner;

public class Porsenimboh22 {
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        String[][] atlet = new String[cabangOlahraga.length][5];
        System.out.println("Masukkan nama atlet untuk setiap cabang olahraga:");

        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Cabang: " + cabangOlahraga[i]);
            for (int j = 0; j < 5; j++) {
                System.out.print("Nama Atlet " + (j + 1) + ": ");
                atlet[i][j] = scanner.nextLine();
            }
        }
        System.out.println("Daftar Atlet yang Terdaftar:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Cabang: " + cabangOlahraga[i]);
            for (int j = 0; j < 5; j++) {
                System.out.println("- " + atlet[i][j]);
            }
        }
    }
}
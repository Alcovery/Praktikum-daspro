package Praktikum07;

import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int JumlahTiket = 0, TotalTiketTerjual = 0;
        double hargaTiket = 0, harga = 0, totalHarga = 0, diskon = 0;
        String lanjut = "y";

        do {
            System.out.println("masukkan jumlah tiket: ");
            JumlahTiket = sc.nextInt();
            sc.nextLine();

            if (JumlahTiket == 0) {
                harga = JumlahTiket * hargaTiket;
             if (JumlahTiket > 10) {
                diskon = 0.15;
                harga -= harga * diskon;
            } else if (JumlahTiket > 4) {
                diskon = 0.10;
                harga -= harga * diskon;
            }

            TotalTiketTerjual += JumlahTiket;
            totalHarga += harga;

            System.out.println("y");
            System.out.println("tiket terjual: " + JumlahTiket);
            System.out.println("harga penjualan tiket: " + harga);
        }

        System.out.print("apakah ingin melanjutkan? (y/t): ");
        lanjut = sc.nextLine();
        System.out.println("--------------------");
    
    } while (lanjut.equalsIgnoreCase("y"));
    System.out.println("y");
    System.out.println("total tiket terjual: " + TotalTiketTerjual);
    System.out.println("total harga penjualan tiket: " + totalHarga);

    sc.close();
}
}


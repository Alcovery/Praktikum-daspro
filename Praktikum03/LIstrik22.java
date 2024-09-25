package Praktikum03;

import java.util.Scanner;

public class LIstrik22 {

public class PenggunaanListrik {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna memasukkan pemakaian listrik dalam kWh
        System.out.print("Masukkan pemakaian listrik (kWh): ");
        double pemakaian = input.nextDouble();
        
        // Mengecek apakah pemakaian melebihi 500 kWh
        boolean melebihi = pemakaian > 500;
        
        // Menampilkan hasil
        if (melebihi) {
            System.out.println("Pemakaian listrik melebihi 500 kWh.");
        } else {
            System.out.println("Pemakaian listrik tidak melebihi 500 kWh.");
        }
        
        // Menutup objek Scanner
        input.close();
    }
    }
}
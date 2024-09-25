package Praktikum03;

import java.util.Scanner;

public class Bank22 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)){

            //variabel
            double tabunganAwal, tabunganAkhir, bunga, persentaseBunga;
            int lamaMenabung;

            //inisiasi nilai variabel persentaseBunga
            persentaseBunga = 0.0002;

            //perintah untuk mengimputkan tabunganAwal dan lamaMenabung
            System.out.println("Masukkan jumlah tabungan awal: ");
            tabunganAwal = sc.nextDouble();
            System.out.println("Masukkan lama menabung (bulan): ");
            lamaMenabung = sc.nextInt();

            //perintah untuk menghitung bunga
            bunga = persentaseBunga * lamaMenabung * tabunganAwal;

            //perintah untuk menghitung tabunganAkhir
            tabunganAkhir = tabunganAwal + bunga;

            System.out.println("Bunga: " + bunga);
            System.out.println("Tabungan akhir: " + tabunganAkhir);


        }
    }
}

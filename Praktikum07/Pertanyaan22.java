package Praktikum07;

import java.util.Scanner;

public class Pertanyaan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double nilai, tertinggi = 0, terendah = 100;
        int mahasiswaLulus = 0, mahasiswaTidakLulus = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                mahasiswaLulus++;
            } else {
                mahasiswaTidakLulus++;
            }
        }

        System.out.println("");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("jumlah mahasiswa lulus: " + mahasiswaLulus);
        System.out.println("jumlah mahasiswa tidak lulus: " + mahasiswaTidakLulus);
       
        sc.close();
    }
}
    


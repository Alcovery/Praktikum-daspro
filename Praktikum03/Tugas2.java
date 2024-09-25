package Praktikum03;

import java.util.Scanner

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah jam kerja: ");
        double jumlahJamKerja = scanner.nextDouble();

        System.out.println("Masukkan upah per jam: ");
        double upahPerJam = scanner.nextDouble();

        double gajiBersih = hitungGaji(jumlahJamKerja, upahPerJam);

        System.out.println("Gaji bersih yang diterima: Rp%.2f/n, gajiBersih");

        Scanner.close();

    }

    private static double hitungGaji(double jumlahJamKerja, double upahPerJam) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungGaji'");
    }
    
}

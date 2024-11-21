package Praktikum9;

import java.util.Scanner;

public class Arrayratanilai22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc22.nextInt();

        int[] nilaiMhs= new int[jumlahMhs];
        double totalLulus = 0, totalTidakLlulus = 0;
        int countlulus = 0, countTidakLulus = 0;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc22.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                countlulus++;
            } else {
                totalTidakLlulus += nilaiMhs[i];
                countTidakLulus++;
            }
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
            double rataLulus = countlulus > 0? totalLulus / 
            countlulus : 0;
            double rataTidakLulus = countTidakLulus = 0;
            
        System.out.println("Rata-rata nilai lulus = "+ rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        System.out.println("Nilai tertinggi = " + nilaiTertinggi);
        System.out.println("Nilai terendah = " + nilaiTerendah);
sc22.close();
    }
    
}

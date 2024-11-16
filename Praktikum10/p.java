package Praktikum10;

import java.util.Scanner;

public class p {
    public static void main(String[] args) {
        
    Scanner sc22 = new Scanner(System.in);
    int[] nilaiAkhir = new int[10];

    for ( int i = 0; i < nilaiAkhir.length; i++) {
        System.out.println("Masukkan nilai akhir ke-"+i+" : ");
        nilaiAkhir[i] = sc22.nextInt();
    }
    for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70 ) {
            System.out.println("Masukkan nilai akhir ke:-" + i + " lulus!");
        } else {
            System.out.println("Mahasiswa ke-" + i + " tidak lulus!");
        }
    }
    
}
}
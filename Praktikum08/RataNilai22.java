package Praktikum08;

import java.util.Scanner;

public class RataNilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =1;
        while (i<=5) {
           double totalNilai=0;
        for (int j=1; j<=5; i++) {
            System.out.print("Nilai ke-" + j + " =");
            int nilaiMhs=sc.nextInt();
            totalNilai+=nilaiMhs;
        }
        double RataNilai = totalNilai/5;
        i++;
        System.out.println("Rata-rata nilai mahasiswa ke- " + i + "=" + RataNilai);    
    }
    sc.close();
}
}

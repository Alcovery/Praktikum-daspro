package Praktikum9;

import java.util.Scanner;

public class Searchnilai22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);

        System.out.println("Masukkan banyaknya nilai uang akan diinput: ");
        int nilai = sc22.nextInt();

        int[] arrNilai = new int[nilai];
        
        for (int i = 0; i < nilai; i++) {
             System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
                arrNilai[i] = sc22.nextInt();
        }

        System.out.println("Masukkan nilai yang ingin dicari: ");
        int nilaiDicari = sc22.nextInt();
        int hasil = -1;

        for (int i = 0; i < arrNilai.length; i++) {
            if (nilaiDicari == arrNilai [i]) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Nilai "+nilaiDicari+" ketemu, merupakan  nilai mahasiswa ke-" + (hasil + 1));
        }

        sc22.close();
    }
   
}

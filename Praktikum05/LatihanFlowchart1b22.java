package Praktikum05;

import java.util.Scanner;

public class LatihanFlowchart1b22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int bilSatu, bilDua, bilTiga;

        System.out.println("Masukkan bilangan 1: ");
        bilSatu = sc.nextInt();

        System.out.println("Masukkan bilangan 2");
        bilDua = sc.nextInt();

        System.out.println("Masukkan bilangan 3");
        bilTiga = sc.nextInt();

        if (bilSatu > bilDua) {
            if (bilSatu > bilTiga) {
                System.out.println("Bilangan terbesar adalah " + bilSatu);
            } else {
                System.out.println("Bilangan terbesar adalah " + bilTiga);
            }
        }
        else 
        if (bilDua > bilTiga) {
            System.out.println("Bilangan terbesar adalah " + bilDua);
        } else {
            System.out.println("Bilangan terbesar adalah " + bilTiga);
        }
        sc.close();
    
    }
    
}


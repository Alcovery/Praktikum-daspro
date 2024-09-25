package Praktikum03;

    import java.util.Scanner;

public class Gajikaryawan {
    
    // Metode untuk menghitung gaji bersih
    public static double hitungGaji(double jumlahJamKerja, double upahPerJam) {
        // 1. Hitung gaji dasar
        double gajiDasar = jumlahJamKerja * upahPerJam;
        
        // 2. Hitung bonus 10% dari gaji dasar
        double bonus = 0.10 * gajiDasar;
        
        // 3. Hitung total gaji sebelum pajak
        double totalGajiSebelumPajak = gajiDasar + bonus;
        
        // 4. Hitung pajak 5% dari total gaji sebelum pajak
        double pajak = 0.05 * totalGajiSebelumPajak;
        
        // 5. Hitung gaji bersih setelah pajak
        double gajiBersih = totalGajiSebelumPajak - pajak;
        
        return gajiBersih;
    }

    public static void main(String[] args) {
        // Membuat scanner untuk input data
        Scanner scanner = new Scanner(System.in);
        
        // Input jumlah jam kerja dan upah per jam
        System.out.print("Masukkan jumlah jam kerja: ");
        double jumlahJamKerja = scanner.nextDouble();
        
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = scanner.nextDouble();
        
        // Hitung gaji bersih
        double gajiBersih = hitungGaji(jumlahJamKerja, upahPerJam);
        
        // Output gaji bersih
        System.out.printf("Gaji bersih yang diterima: Rp%.2f\n", gajiBersih);
        
        // Tutup scanner
        scanner.close();
    }
}



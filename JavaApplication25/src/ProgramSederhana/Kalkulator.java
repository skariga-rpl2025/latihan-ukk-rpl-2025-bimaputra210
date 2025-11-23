package ProgramSederhana;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("==== Kalkulator Sederhana ====\n Pilih OPerasi :");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        
        System.out.print("\nMasukkan pilihan (1-4) : ");
        int pilihan = inp.nextInt();
        System.out.print("Masukkan angka pertama : ");
        double a = inp.nextDouble();
        System.out.print("Masukkan angka kedua : ");
        double b = inp.nextDouble();
        
        System.out.println("");
        switch (pilihan) {
            case 1:
                System.out.println("Hasil Pertambahan : " + (a+b));
                break;
            case 2:
                System.out.println("Hasil Pengurangan : " + (a-b));
                break;
            case 3:
                System.out.println("Hasil Perkalian : " + (a*b));
                break;
            case 4:
                System.out.println("Hasil Pembagian : " + (a/b));
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
        }
    }
}

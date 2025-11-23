package ProgramSederhana;

import java.util.Scanner;

public class Voting {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean mode = true;
        int a = 0, b = 0;
        System.out.println("==== Program Voting OSIS ====\n (Ketik ''selesai'' untuk mengakhiri)\n");

        do {
            System.out.print("Masukkan pilihan Anda (A/B) : ");
            String pilihan = inp.nextLine().toLowerCase();
            if (pilihan.equals("a")) {
                a++;
            } else if (pilihan.equals("b")) {
                b++;
            } else if (pilihan.equals("selesai")) {
                mode = false;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        } while (mode);
        System.out.println("\n=========================\nHasil Hitung Cepat");
        System.out.println("Total Suara Kandidat A : " + a);
        System.out.println("Total Suara Kandidat B : " + b);
    }
}

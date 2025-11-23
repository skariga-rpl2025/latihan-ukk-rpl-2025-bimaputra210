package ProgramSederhana;

import java.util.Scanner;

public class DaftarGym {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int anggota = 0;
        boolean mode = true;
        System.out.println("==== Pendaftaran Anggota Gym ====\n");
        do {
        System.out.print("Masukkan nama anggota : ");
        String nama = inp.nextLine();
        System.out.print("Daftar anggota lagi? [ya/tidak] : ");
        String pilihan = inp.nextLine().toLowerCase();
            if (pilihan.equals("ya")) {
            } else {
                mode = false;
            }
                anggota++;
                System.out.println("");
        } while (mode);
        System.out.println("================================");
        System.out.println("Total anggota yang didaftarkan : " + anggota);
    }
}

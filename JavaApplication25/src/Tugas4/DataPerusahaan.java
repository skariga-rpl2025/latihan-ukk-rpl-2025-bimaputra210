package Tugas4;

public class DataPerusahaan {
    public static void main(String[] args) {
        Karyawan emp = new Karyawan();
        
        emp.setNip("K001");
        emp.setNama("Budi Hartono");
        emp.setDivisi("Marketing");
        
        System.out.println("==== Data Karyawan ====");
        System.out.println("NIP    : " + emp.getNip());
        System.out.println("Nama   : " + emp.getNama());
        System.out.println("Divisi : " + emp.getDivisi());
    }
}

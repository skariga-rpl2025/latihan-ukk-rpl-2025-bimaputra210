package Tugas5;

public class DataParkir {
    public static void main(String[] args) {
        Kendaraan car = new Kendaraan();
        
        car.setNoPolisi("N 1234 AA");
        car.setMerk("Toyota Avanza");
        car.setTahun(2022);
        
        System.out.println("==== Data Kendaraan ====");
        System.out.println("No. Polisi : " + car.getNoPolisi());
        System.out.println("Merk       : " + car.getMerk());
        System.out.println("Tahun      : " + car.getTahun());
    }
}

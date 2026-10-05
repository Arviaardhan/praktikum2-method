// Challenge - Sistem Data Kendaraan Pertemuan


import java.text.NumberFormat;
import java.util.Locale;

class Vehicle {
    String merk, tipe;
    int harga;
    double pajak;

    void tampilkanData() {
        NumberFormat formatRupiah = NumberFormat.getNumberInstance(new Locale("id", "ID"));

        System.out.println("Merk : " + merk);
        System.out.println("Harga : " + formatRupiah.format(harga));
    }

    double hitungPajak(String tipe) {

        if (tipe.equals("Motor")) {
            return pajak = 0.1;
        } else if (tipe.equals("Mobil")) {
            return pajak = 0.3;
        } else {
            return pajak;
        }
    }

    double hitungHargaSetelahPajak() {
        double hargaAkhir;
        hargaAkhir = harga * hitungPajak(tipe);
        return harga + hargaAkhir;
    }
}

public class VehicleData {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        NumberFormat formatRupiah = NumberFormat.getNumberInstance(new Locale("id", "ID"));

        vehicle.merk = "Yamaha";
        vehicle.tipe = "Motor";
        vehicle.harga = 10000000;

        vehicle.tampilkanData();
        System.out.println("Pajak yang anda peroleh : " + formatRupiah.format(vehicle.harga * vehicle.hitungPajak(vehicle.tipe)));
        System.out.println("Harga Akhir Setelah Pajak : " + formatRupiah.format(vehicle.hitungHargaSetelahPajak()));
    }
}

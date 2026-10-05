// Tugas Praktikum – Sistem Data Produk

import java.text.NumberFormat;
import java.util.Locale;

class Product {
    String kodeProduk, namaProduk;
    int hargaProduk, jumlahStokProduk;

    void tampilkanData() {
        NumberFormat formatRupiah = NumberFormat.getNumberInstance(new Locale("id", "ID"));

        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga Produk : " + formatRupiah.format(hargaProduk));
//        System.out.println("Jumlah Stok Produk : " + jumlahStokProduk);
    }

    double hitungTotalHarga() {
        return hargaProduk * jumlahStokProduk;
    }

    int tambahStok(int jumlah) {
        return jumlahStokProduk += jumlah;
    }

    int kurangiStok(int jumlah) {
        return jumlahStokProduk -= jumlah;
    }

    void cekStok() {
        System.out.println("Jumlah Stok Produk Saat Ini : " + jumlahStokProduk);;
    }
}

public class DataProductSystem {
    public static void main(String[] args) {
        NumberFormat formatRupiah = NumberFormat.getNumberInstance(new Locale("id", "ID"));
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();

        product1.kodeProduk= "P1";
        product1.namaProduk = "Beras";
        product1.hargaProduk = 15000;
        product1.jumlahStokProduk = 20;
        product1.tambahStok(10);
        product1.kurangiStok(30);

        product2.kodeProduk= "P2";
        product2.namaProduk = "Gula";
        product2.hargaProduk = 10000;
        product2.jumlahStokProduk = 30;
        product2.tambahStok(50);
        product2.kurangiStok(5);

        product3.kodeProduk= "P3";
        product3.namaProduk = "Susu Kental Manis";
        product3.hargaProduk = 5000;
        product3.jumlahStokProduk = 50;
        product3.tambahStok(5);
        product3.kurangiStok(3);

        product1.tampilkanData();
        product1.cekStok();
        System.out.println("Total Harga : " + formatRupiah.format(product1.hitungTotalHarga()));
        System.out.println("=========================");
        product2.tampilkanData();
        product2.cekStok();
        System.out.println("Total Harga : " + formatRupiah.format(product2.hitungTotalHarga()));
        System.out.println("=========================");
        product3.tampilkanData();
        product3.cekStok();
        System.out.println("Total Harga : " + formatRupiah.format(product3.hitungTotalHarga()));
        System.out.println("=========================");
    }
}
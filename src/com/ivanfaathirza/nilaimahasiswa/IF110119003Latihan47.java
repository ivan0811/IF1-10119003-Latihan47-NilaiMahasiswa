package com.ivanfaathirza.nilaimahasiswa;

/**
 *
 * @author Ivan
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : program ini untuk menghitung nilai akhir, menentukan index
 * dan keterangan menggunakan konstruktor dengan berorientasi objek
 */

public class IF110119003Latihan47 {

    public static void main(String[] args) {
        Nilai nilai = new Nilai(75, 45,34);
        double NA = nilai.hitungNA();
        char Index = nilai.menentukanIndex(NA);
        System.out.println("QUIZ        = " + nilai.getQUIZ());
        System.out.println("UTS         = " + nilai.getUTS());
        System.out.println("UAS         = " + nilai.getUAS());
        System.out.println("\nNIlai Akhir = " + NA);
        System.out.println("\nIndex = " + Index);
        System.out.println("Keterangan = " + nilai.hasilKeterangan(Index));
    }
}

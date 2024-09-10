/*
 * Penulis : Gigih Haidar Falah
 * NIM      : 24060122140150
 * Deskripsi : Main cara menghitung luas lingkaran
 * Nama File : MLingkaran.java
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main (String[]Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Jejari Lingkaran = ");
        Lingkaran l = new Lingkaran(scan.nextDouble());
        System.out.println("Luas Lingkaran Dengan" + "Jejari 10.2 satuan adalah = " + l.hitungLuas());
    }
}

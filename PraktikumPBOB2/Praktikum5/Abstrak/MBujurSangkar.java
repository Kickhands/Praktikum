/*
 * Penulis : Gigih Haidar Falah
 * Deskripsi : kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 * Nama File : MBujurSangkar.java
 */

 import java.util.Scanner;

 class MBujurSangkar {
     public static void main (String [] Args){
        
         Scanner scan = new Scanner(System.in);
         BujurSangkar bs = new BujurSangkar();

         System.out.println("Masukkan sisi bujur sangkar : ");
         double sisi = scan.nextDouble();

         System.out.println("Luas Bujur Sangkar dengan sisi " + sisi + " satuan adalah : " + bs.hitungLuas(sisi));
     }
 }
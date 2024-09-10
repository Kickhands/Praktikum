/*
 * Penulis : Gigih Haidar Falah
 * Deskripsi : kelas implementasi IArea berupa cara menghitung luas lingkaran
 * Nama File : Lingkaran.java
 */

 import static java.lang.Math.PI;

 class Lingkaran implements IArea {
     private double jejari;
 
     public Lingkaran(double r){
         jejari = r;
     }
 
     public double hitungLuas(){
         return PI*jejari*jejari;
     }
 }

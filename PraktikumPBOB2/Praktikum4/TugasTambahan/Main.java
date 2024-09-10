/* Nama      : GIGIH HAIDAR FALAH             */
/* NIM       : 24060122140150                 */
/* Nama File : Main.java                      */
/* Deskripsi : File Main dari Buku            */

package book.main;

import book.bukuFiksi.*;
import book.bukunonFiksi.*;

public class Main {
    public static void main(String[]Args){
        bukuAkademik buku1 = new bukuAkademik("DasarPemrograman", "DennySumargo", "1990", "Coding", 246, 150000);
        buku1.view();
        bukuNovel buku2 = new bukuNovel("Jeki1990", "GhifarBaiq", "2024", "Romantis", 128, 500000);
        buku2.view();
    }
}

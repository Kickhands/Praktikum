//File      : Asersil1.java
//Nama      : GIGIH HAIDAR FALAH
//NIM       : 24060122140150
//Tanggal   : 05/03/2024

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0 ;
        if ( x>0 ){
            System.err.println("\nX Bilangan Positif\n");
        }else{
            assert ( x<0 ):"ada kesalahan kode";
            System.err.println("\nX Bilangan Negatif\n");
        }
    }
}

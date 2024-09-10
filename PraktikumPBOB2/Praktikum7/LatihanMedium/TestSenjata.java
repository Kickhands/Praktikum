/*
 * Nama      : Gigih Haidar Falah
 * NIM       : 24060122140150
 */
package LatihanMedium;

public class TestSenjata {

    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");
        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolm16 = new KontrolSenjata(m16);
        
        kontrolAK47.Menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.Menembak(5);
        
        System.out.println("============================");
        
        kontrolm16.Menembak(1);
        kontrolm16.isiPeluru(5);
        kontrolm16.Menembak(2);
    }
    
}
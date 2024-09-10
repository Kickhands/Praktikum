/*Nama      : Gigih Haidar Falah            */
/*Nim       : 24060122140150                */
/*Tanggal   : 02 Mei 2024                   */
/*Nama File : Superman.java                 */

public class Superman extends Kryptonian {
    public String nama;

    public Superman (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return this.nama;
    }

    public void takeOff(){
        System.out.println(nama + " Mau Terbang");
    }

    public void land(){
        System.out.println(nama + " Mendarat");
    }

    public void fly(){
        System.out.println(nama + " Terbang");
    }

    public void leapBuilding(){
        System.out.println(nama + " Melompat Gedung");
    }

    public void stopBullet(){
        System.out.println(nama + " Menahan Peluru");
    }

    public void eat(){
        System.out.println(nama + " Makan");
    }
}

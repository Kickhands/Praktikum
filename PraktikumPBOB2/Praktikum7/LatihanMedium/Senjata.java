/*
 * Nama      : Gigih Haidar Falah
 * NIM       : 24060122140150
 */
package LatihanMedium;

public class Senjata {
    private String Bunyi;
    private boolean Menusuk;
    private int Peluru;
    
    public Senjata(String Bunyi){
        this.Bunyi = Bunyi;
        this.Menusuk = false;
    }
    
    public String getBunyi(){
        return Bunyi;
    }
    
    public int getPeluru(){
        return Peluru;
    }
    
    public boolean isMenusuk(){
        return Menusuk;
    }
    
    public void setBunyi(String Bunyi){
        this.Bunyi = Bunyi;
    }
    
    public void setMenusuk(boolean Menusuk){
        this.Menusuk = Menusuk;
    }
    
    public void setPeluru(int Peluru){
        this.Peluru = Peluru;
    }
}
//File      : Asersi2.java
//Nama      : GIGIH HAIDAR FALAH
//NIM       : 24060122140150
//Tanggal   : 05/03/2024

//secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
//JAWABAN
//Secara konsep sudah benar hanya menurut saya kurang dibagian ini assert karena tidak dapat menangani kondisional lebih dari nol

class Lingkaran {
    private double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0; //Ini Harusnya diubah dengan memberikan nilai yang benar agar progarm menginisialisasi tidak dengan 0
        assert (jarijari > 0) : "\nJari Jari tidak boleh nol !!!";  //Karena disini dinyatakan tidak boleh nol
        Lingkaran lingkaran1 = new Lingkaran(jarijari);
        double kelilingLingkaran = lingkaran1.hitungKeliling();
        System.out.println("\nKeliling Lingkaran = " + kelilingLingkaran);
    }
}

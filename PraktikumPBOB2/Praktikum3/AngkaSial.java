//File      : AngkaSial.java
//Nama      : GIGIH HAIDAR FALAH
//NIM       : 24060122140150
//Tanggal   : 05/03/2024

//PERTANYAAN
// *A.Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
// *B.Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 
//JAWABAN
//A.Menurut saya baris 12 tidak akan diekseksui karena menggunakan if ketika cek angka 13 dan 
//kondisi terpenuhi akan langsung eksekusi ke AngakSialException.java
//B. Menurut saya pada baris 21 akan dieksukusi karena adanya block cacth akan dijalakan ketika terjadi AngkaSialException

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
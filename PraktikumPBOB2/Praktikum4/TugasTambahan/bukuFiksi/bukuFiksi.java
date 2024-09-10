/* Nama      : GIGIH HAIDAR FALAH             */
/* NIM       : 24060122140150                 */
/* Nama File : bukuFiksi.java                 */
/* Deskripsi : File Class bukuFiksi           */

package book.bukuFiksi;

import book.buku.Buku;

public class bukuFiksi extends Buku{
    private String genre;
    private int jumlahHalaman;
    private double harga;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }

    public double getHarga(){
        return this.harga;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void view(){
        super.view();
        System.out.println("Judul Buku Ini Adalah : " + this.getGenre() + " Lalu Penulisnya Adalah : " + this.getJumlahHalaman() + " Dan Tahun Terbitnya Adalah " + this.getHarga());
    }
}

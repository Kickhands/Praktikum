/* Nama      : GIGIH HAIDAR FALAH             */
/* NIM       : 24060122140150                 */
/* Nama File : bukuNonFiksi.java              */
/* Deskripsi : File Class dari bukuNonFiksi   */

package book.bukunonFiksi;

import book.buku.Buku;

public class bukuNonFiksi extends Buku {
    private String subjek;
    private int jumlahHalaman;
    private double harga;

    public bukuNonFiksi (String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){
        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
    }

    public String getSubjek(){
        return this.subjek;
    }

    public int getJumlahHalaman(){
        return this.jumlahHalaman;
    }

    public double getHarga(){
        return this.harga;
    }

    public void setSubjek(String subjek){
        this.subjek = subjek;
    }

    public void  setJumlahHalaman(int jumlahHalaman){
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void view(){
        super.view();
        System.out.println("Judul Buku Ini Adalah : " + this.getSubjek() + " Lalu Penulisnya Adalah : " + this.getJumlahHalaman() + " Dan Tahun Terbitnya Adalah " + this.getHarga());
    }
}

/* Nama      : GIGIH HAIDAR FALAH             */
/* NIM       : 24060122140150                 */
/* Nama File : buku.java                      */
/* Deskripsi : File Class buku                */

package book.buku;

public class Buku {
    private String judul;
    private String penulis;
    private String tahunTerbit;

    public Buku (String judul, String penulis, String tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul(){
        return this.judul;
    }

    public String getPenulis(){
        return this.penulis;
    }

    public String getTahunTerbit(){
        return this.tahunTerbit;
    }

    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public void setPenulis(String penulis){
        this.penulis = penulis;
    }

    public void view(){
        System.out.println("Judul Buku Ini Adalah : " + this.getJudul() + " Lalu Penulisnya Adalah : " + this.getPenulis() + " Dan Tahun Terbitnya Adalah " + this.getTahunTerbit());
    }
}



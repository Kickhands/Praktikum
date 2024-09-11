/* 
* Nama		: Muhammad Naufal Izzudin
* NIM		: 24060122120018
* File		: RuangLabKom.java
* Deskripsi	: representasi dasar dari objek RuangLabKom, turunan kelas Ruang
*/

package org.jenis;
import org.ruang.Ruang;

public class RuangLabKom extends Ruang {
	private String namaLab;
	private int jmlKomputer;
	private static int jmlRuangLabKom;
    
    public RuangLabKom(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, int jmlKomputer){
        super(kode, panjang, lebar, tinggi, kapasitas);
		this.namaLab = namaLab;
		this.jmlKomputer = jmlKomputer;
		jmlRuangLabKom++;
		counterRuang++;
    }
	
	public static int getCounterRuangLabKom(){
		return jmlRuangLabKom;
	}
	
	@Override
	public double getBiayaKebersihan(){
		return super.getBiayaKebersihan();
	}
	
	public double getBiayaSewa(){
		return jmlKomputer * 120018;

	}
	
	public String getNamaLab(){
		return namaLab;
	}
    
	public void Info(){
		super.Info();
		System.out.println("Nama Lab : " + getNamaLab());
		System.out.println("Biaya Kebersihan : " + getBiayaKebersihan());
		System.out.println("Biaya Sewa : " + getBiayaSewa());
	}
}

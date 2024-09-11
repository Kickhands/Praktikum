
package org.jenis;
import org.ruang.Ruang;

public class RuangLabNonKom extends Ruang{
	private String namaLab;
	private int jmlMatkul;
	private static int jmlRuangLabNonKom;
	
	public RuangLabNonKom(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, int jmlMatkul){
        super(kode, panjang, lebar, tinggi, kapasitas);
		this.namaLab = namaLab;
		this.jmlMatkul = jmlMatkul;
		jmlRuangLabNonKom++;
		counterRuang++;
    }
	
	public RuangLabNonKom(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jmlMatkul){
        super(kode, panjang, lebar, tinggi, kapasitas);
		this.jmlMatkul = jmlMatkul;
		jmlRuangLabNonKom++;
    }
	
	public static int getCounterRuangLabNonKom(){
		return jmlRuangLabNonKom;
	}
	
	@Override
	public double getBiayaKebersihan(){
		return super.getBiayaKebersihan();
	}
	
	public double getBiayaSewa(){
		return jmlMatkul * 2120018;
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

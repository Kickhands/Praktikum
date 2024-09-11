
package org.jenis;
import org.ruang.Ruang;

public class RuangDosen extends Ruang{
	private String namaDosen;
	private int jmlKursi;
	private int jmlMeja;
	static int jmlRuangDs;
	
	public RuangDosen(){
	}
	
	public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int jmlKursi, int jmlMeja){
		super(kode, panjang, lebar, tinggi, kapasitas);
		this.namaDosen = namaDosen;
		this.jmlKursi = jmlKursi;
		this.jmlMeja = jmlMeja;
		jmlRuangDs++;
		counterRuang++;
	}
	
	public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        jmlRuangDs++;
    }
	
	public static int getCounterRuangDosen(){
		return jmlRuangDs;
	}
	
	public double getBiayaKebersihan(){
		return super.getBiayaKebersihan();
	}
	
	public void Info(){
		super.Info();
		System.out.println("Nama Dosen : " + namaDosen);
		System.out.println("Jumlah Kursi : " + jmlKursi);
		System.out.println("Jumlah Meja : " + jmlMeja);
		System.out.println("Biaya Kebersihan : " + getBiayaKebersihan());
	}
}



package org.jenis;
import org.ruang.Ruang;

public class RuangKelas extends Ruang{
	private int jmlKursiTersedia;
	private int jmlKursiRusak;
	static int jmlRuangKls;
	
	public RuangKelas(){
	}
	
	public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jmlKursiTersedia, int jmlKursiRusak){
		super(kode, panjang, lebar, tinggi, kapasitas);
		this.jmlKursiTersedia = jmlKursiTersedia;
		this.jmlKursiRusak = jmlKursiRusak;
		jmlRuangKls++;
		counterRuang++;
	}
	
	public static int getCounterRuangKelas(){
		return jmlRuangKls;
	}
	
	public double getBiayaKebersihan(){
		return super.getBiayaKebersihan();
	}
	
	public void Info(){
		super.Info();
		System.out.println("Jumlah Kursi Tersedia : " + jmlKursiTersedia);
		System.out.println("Jumlah Kursi Rusak : " + jmlKursiRusak);
		System.out.println("Biaya Kebersihan : " + getBiayaKebersihan());
	}
}


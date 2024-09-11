
package org.jenis;
import org.ruang.Ruang;

public class RuangDepartemen extends Ruang{
	private String namaDept;
	private String namaKetDept;
	static int jmlRuangDept;
	
	public RuangDepartemen(){
	}
	
	public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDept, String namaKetDept){
		super(kode, panjang, lebar, tinggi, kapasitas);
		this.namaDept = namaDept;
		this.namaKetDept = namaKetDept;
		jmlRuangDept++;
		counterRuang++;
	}
	
	public static int getCounterRuangDepartemen(){
		return jmlRuangDept;
	}
	
	public double getBiayaKebersihan(){
		return super.getBiayaKebersihan();
	}
	
	public void Info(){
		super.Info();
		System.out.println("Nama Departemen : " + namaDept);
		System.out.println("Nama Ketua Departemen : " + namaKetDept);
		System.out.println("Biaya Kebersihan : " + getBiayaKebersihan());
	}
}

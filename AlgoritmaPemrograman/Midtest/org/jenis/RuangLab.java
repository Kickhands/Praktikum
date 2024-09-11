
package org.jenis;
import org.ruang.Ruang;

public class RuangLab extends Ruang{
	private boolean isKom;
	private int jmlKomputer;
	private int jmlMatkul;
	private static int jmlRuangLabKom = 0; 
    private static int jmlRuangLabNonKom = 0;
		
	public RuangLab(String kode, double panjang, double lebar, double tinggi, int kapasitas, boolean isKom, int jumlah){
        super(kode, panjang, lebar, tinggi, kapasitas);
		this.isKom = isKom;
		
		if(isKom){
			this.jmlKomputer = jumlah;
			jmlRuangLabKom++;
			counterRuang++;
		}else{
			this.jmlMatkul = jumlah;
			jmlRuangLabNonKom++;
			counterRuang++;
		}
	}
	
	public static int getCounterRuangLaboratorium(){
		return RuangLabKom.getCounterRuangLabKom() + RuangLabNonKom.getCounterRuangLabNonKom();
	}
	
	public double getBiayaKebersihan(){
		return super.getBiayaKebersihan();
	}
	
	public double getBiayaSewa(int digitNim){
		if(isKom){
			return jmlKomputer * digitNim * 6;
		}else{
			return 0.0;
		}
	}
	
	public double getBiayaSewa(double digitNim){
		if(!isKom){
			return jmlMatkul * digitNim * 7;
		}else{
			return 0.0;
		}
	}
	
	@Override
	public void Info(){
		super.Info();
		System.out.println("Biaya Kebersihan : " + getBiayaKebersihan());
		if(isKom){
			System.out.println("Biaya Sewa : " + getBiayaSewa(jmlKomputer % 10));
		}else{
			System.out.println("Biaya Sewa : " + getBiayaSewa(jmlMatkul % 10));
		}
	}
}

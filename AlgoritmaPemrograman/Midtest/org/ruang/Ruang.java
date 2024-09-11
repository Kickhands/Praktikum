
package org.ruang;

public abstract class Ruang{
	protected String kode;
	protected double panjang;
	protected double lebar;
	protected double tinggi;
	protected int kapasitas;
	public static int counterRuang;
	
	protected Ruang(){
	}
	
	protected Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas){
		this.kode = kode;
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
		this.kapasitas = kapasitas;
		counterRuang++;
	}
	
	public static int getCounterRuang(){
		return counterRuang;
	}

	public double getBiayaKebersihan(){
		double biayaKebersihan = ((panjang * lebar * tinggi) * 500 * 18);
		return biayaKebersihan;
	}
	
	public void Info(){
		System.out.println("Kode : " + kode);
		System.out.println("Panjang : " + panjang); 
		System.out.println("Lebar : " + lebar);
		System.out.println("Kapasitas : " + kapasitas);
	}
}


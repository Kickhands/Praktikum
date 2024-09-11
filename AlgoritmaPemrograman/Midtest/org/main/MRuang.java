

package org.main;
import org.jenis.*;

public class MRuang {
public static void main(String[] args) {
        RuangDepartemen rd1 = new RuangDepartemen("FSM105",6,10,4,25,"Informatika","Retno K");
        RuangKelas rk1 = new RuangKelas("B203",5,8,4,20,18,2); //18 kursi baik, 2 kursi rusak
        RuangDosen rdos1 = new RuangDosen("FSME301",3,2,4,2,"Satriyo A",3,2); //3 kursi, 2 meja
        RuangDosen rdos2 = new RuangDosen("FSME399",3,2,4,2); //ruang dosen belum terpakai
		RuangLabKom rlk1 = new RuangLabKom("LKIFE01",10,10,4,40,"Lab IF E01",40); //40PC
		RuangLabNonKom rlnk1 = new RuangLabNonKom("LNKFIF01",10,10,4,30,"Lab FISIKA F01",3); //3Makul
		RuangLabNonKom rlnk2 = new RuangLabNonKom("LNKBIB01",10,10,4,30,5); //5Makul

		rd1.Info(); //termasuk biaya kebersihannya
        rk1.Info(); //termasuk biaya kebersihannya
        rdos1.Info(); //termasuk biaya kebersihannya
        rlk1.Info(); //termasuk biaya kebersihannya dan biaya sewanya
        rlnk1.Info(); //termasuk biaya kebersihannya dan biaya sewanya

		int totalRuang = RuangDepartemen.getCounterRuangDepartemen() + RuangKelas.getCounterRuangKelas() +
                    RuangDosen.getCounterRuangDosen() + RuangLabKom.getCounterRuangLabKom() +
                    RuangLabNonKom.getCounterRuangLabNonKom();

		System.out.println("Jumlah Ruang = " + totalRuang);
        System.out.println("Jumlah Ruang Departemen = " + RuangDepartemen.getCounterRuangDepartemen());
        System.out.println("Jumlah Ruang Kelas = " + RuangKelas.getCounterRuangKelas());
        System.out.println("Jumlah Ruang Dosen = " + RuangDosen.getCounterRuangDosen());
        System.out.println("Jumlah Laboratorium = " + (RuangLabKom.getCounterRuangLabKom() + RuangLabNonKom.getCounterRuangLabNonKom()));
        System.out.println("Jumlah Lab Komputer = " + RuangLabKom.getCounterRuangLabKom());
        System.out.println("Jumlah Lab Non Komputer = " + RuangLabNonKom.getCounterRuangLabNonKom());
    }
}

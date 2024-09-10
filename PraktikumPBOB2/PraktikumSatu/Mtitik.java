//NAME    : GIGIH HAIDAR FALAH
//NIM     : 24060122140150
//PRAKTIKUM 1

public class Mtitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.setAbsis(2);
        t1.setOrdinat(3);

        Titik t2 = new Titik();
        t2.setAbsis(4);
        t2.setOrdinat(5);

        Titik t3 = new Titik(1,2);

        System.out.println("jumlah objek titik : " + Titik.getCounterTitik());

        System.out.println("t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + "," + t3.getOrdinat() + ")");
    }
}

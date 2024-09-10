    //NAME    : GIGIH HAIDAR FALAH
    //NIM     : 24060122140150
    //PRAKTIKUM 2

public class Mtitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3 = new Titik(2,3);

        System.err.println("\nGIGIH HAIDAR FALAH-24060122140150\n");
        System.out.println("Titik t1,t2,t3  = ");
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        System.out.println("\nJarak titik ke (0,0)  = ");
        System.out.println("jarak titik t1  : " + t1.getJarakPusat());
        System.out.println("jarak titik t2  : " + t2.getJarakPusat());

        System.out.println("\nAfter Mirroring sb-x    = ");
        System.out.println("t1" + t1.getRefleksiX());
        System.out.println("t2" + t2.getRefleksiX());
        System.out.println("t3" + t3.getRefleksiX());

        System.out.println("\nAfter Mirroring sb-y      = ");
        System.out.println("t1" + t1.getRefleksiY());
        System.out.println("t2" + t2.getRefleksiY());
        System.out.println("t3" + t3.getRefleksiY());

    }
}

    
   




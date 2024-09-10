public class MGaris {
    public static void main(String[] args) {
        
        Titik t1 = new Titik(2, 2);
        Titik t2 = new Titik(3, 6);

        Titik t3 = new Titik(-3,2);
        Titik t4 = new Titik(-2,4);
        
     
        Garis g1 = new Garis(t1, t2);
        Garis g2 = new Garis(t3, t4);
        Garis g3 = g1.getRefleksiY();
        
        System.err.println("\nGIGIH HAIDAR FALAH-24060122140150\n");
        System.out.println("Titik Awal dan Titik Akhir = ");
        System.out.println("T0 garis g1         : " + g1.getTitikAwal().toString());
        System.out.println("T1 garis g1         : " + g1.getTitikAkhir().toString());
        System.out.println("T0 garis g2         : " + g2.getTitikAwal().toString());
        System.out.println("T1 garis g2         : " + g2.getTitikAkhir().toString());
        System.out.println("\nPanjang garis = ");
        System.out.println("Panjang garis g1    : " + g1.getPanjang());
        System.out.println("Panjang garis g2    : " + g2.getPanjang());
        System.out.println("\nGradien Garis");
        System.out.println("g1    : " + g1.getGradien());
        System.out.println("g2    : " + g2.getGradien());
        System.out.println("\nRefleksi titik g1 terhadap sb-Y");
        System.out.println("T0' garis g1     : " + g3.getTitikAwal().toString());
        System.out.println("T1' garis g1     : " + g3.getTitikAkhir().toString());
        System.out.println("\nisTegakLurus = ");
        if(g1.isTegakLurus(g2)){
            System.out.println("g1 TegakLurus g2");
        }else{
            System.out.println("g1 *tidak* TegakLurus g2");
        }
    }
}



    //NAME    : GIGIH HAIDAR FALAH
    //NIM     : 24060122140150
    //PRAKTIKUM 2


public class MPrismaSegitiga {
    public static void main(String[] args) {
      
        Segitiga segitiga = new Segitiga(6, 8);
        PrismaSegitiga prisma = new PrismaSegitiga(segitiga, 10);
        double volume = prisma.hitungVolume();
        double luasPermukaan = prisma.hitungLuasPermukaan();
        
        System.out.println("\nGIGIH HAIDAR FALAH = 24060122140150 \n");

        System.out.println("SEGITIGA");
        System.out.println("AlasSegitiga     : " + segitiga.getAlas());
        System.out.println("TinggiSegitiga   : " + segitiga.getTinggiSegitiga());
        System.out.println("LuasSegitiga     : " + segitiga.hitungLuas());

        System.out.println("\nVolume PrismaSegitiga: " + volume);

        System.out.println("Luas PrismaSegitiga: " + luasPermukaan);
        System.out.println("\n");

    }
}

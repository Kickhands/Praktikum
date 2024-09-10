    //NAME    : GIGIH HAIDAR FALAH
    //NIM     : 24060122140150
    //PRAKTIKUM 2


public class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggi){
        this.alas = alas;
        this.tinggiPrisma = tinggi;
    }

    public double hitungVolume(){
        return (0.5 * alas.hitungLuas() * tinggiPrisma);
    }

    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();
        double luasSamping = alas.getAlas() * tinggiPrisma + 2 * alas.getTinggiSegitiga() * tinggiPrisma;
        double luasTotal = luasAlas + luasSamping;
        return luasTotal;
    
    }
    
}

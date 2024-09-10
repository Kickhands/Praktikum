    //NAME    : GIGIH HAIDAR FALAH
    //NIM     : 24060122140150
    //PRAKTIKUM 2


public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return alas;
    }

    public double getTinggiSegitiga(){
        return tinggi;
    } 

    public double hitungLuas(){
        return (0.5 * alas * tinggi);
    }

}

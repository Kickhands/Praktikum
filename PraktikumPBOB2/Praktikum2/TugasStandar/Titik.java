    //NAME    : GIGIH HAIDAR FALAH
    //NIM     : 24060122140150
    //PRAKTIKUM 2


public class Titik {
    private double absis;
    private double ordinat;


    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public Titik(){
        this(0,0);
    }

    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public double getJarakPusat() {
        double jarak = Math.sqrt(absis * absis + ordinat * ordinat);
        return Double.parseDouble(String.format("%.2f", jarak));
    }
    
    public void refleksiX(){
        ordinat = -ordinat;
    }

    public void refleksiY(){
        absis = -absis;
    }

    public Titik getRefleksiX(){
        return new Titik(absis, -ordinat);
    }

    public Titik getRefleksiY() {
       
        return new Titik(-absis, ordinat);
    }

    @Override
    public String toString() {
        return "(" + absis + ", " + ordinat + ")";
    }

}

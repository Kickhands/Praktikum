/*Nama      : Gigih Haidar Falah            */
/*Nim       : 24060122140150                */
/*Tanggal   : 02 Mei 2024                   */
/*Nama File : iFlyer.java                   */

public class Helicopter extends Airplane {
    private double maxLoad;
    
    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficency(){
        return this.maxLoad / 10;
    }

    public double calcTripDistance(){
        return this.maxLoad * 7;
    }

    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }

    public void takeOff(){
        System.out.println("Helicopter Segera Take Off");
    }

    public void land(){
        System.out.println("Helicopter Segera Mendarat");
    }

    public void fly(){
        System.out.println("Helicopter Sedang Terbang");
    }

    public Helicopter(){
        this.maxLoad = 20;
    }
}

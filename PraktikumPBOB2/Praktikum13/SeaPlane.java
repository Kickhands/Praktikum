/*Nama      : Gigih Haidar Falah            */
/*Nim       : 24060122140150                */
/*Tanggal   : 02 Mei 2024                   */
/*Nama File : SeaPlane.java                 */

public class SeaPlane extends Airplane {
    private double maxLoad;

    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficency(){
        return this.maxLoad / 8;
    }

    public double calcTripDistance(){
        return this.maxLoad * 5;
    }

    public String toString(){
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }

    public void takeOff(){
        System.out.println("SeaPlane Segera Take Off");
    }

    public void land(){
        System.out.println("SeaPlane Segera Mendarat");
    }

    public void fly(){
        System.out.println("SeaPlane Sedang Terbang");
    }

    public SeaPlane(){
        this.maxLoad = 50;
    }
}

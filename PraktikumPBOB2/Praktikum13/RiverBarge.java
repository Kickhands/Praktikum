/*Nama      : Gigih Haidar Falah            */
/*Nim       : 24060122140150                */
/*Tanggal   : 02 Mei 2024                   */
/*Nama File : RiverBarge.java               */

public class RiverBarge extends Vehicle {
    private double maxLoad;
    
    public RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return maxLoad / 5.0;
    }

    public double calcTripDistance() {
        return this.calcFuelEfficiency() * 5;
    }
}

/*Nama      : Gigih Haidar Falah            */
/*Nim       : 24060122140150                */
/*Tanggal   : 02 Mei 2024                   */
/*Nama File : Vehicle.java                  */

public abstract class Vehicle {
    public double calcFuelEfficency;
    public double calcTripDistance;

    public String toString(){
        return this.getClass().getSimpleName();
    }
}
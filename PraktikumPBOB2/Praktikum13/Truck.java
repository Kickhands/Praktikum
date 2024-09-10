/*Nama      : Gigih Haidar Falah            */
/*Nim       : 24060122140150                */
/*Tanggal   : 02 Mei 2024                   */
/*Nama File : Truck.java                    */

public class Truck extends Vehicle {
    private double maxLoad;

    public Truck(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency() {
        return this.maxLoad / 2;
    }

    public double calcTripDistance() {
        // Implementation here
        return this.calcFuelEfficency * 2;
    }

    public String toString(){
        return "Truck adalah Angkutan Darat yang handal";
    }

    public Truck(){
        this.maxLoad = 100;
    }
}

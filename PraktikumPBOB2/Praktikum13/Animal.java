/*Nama      : Gigih Haidar Falah            */
/*Nim       : 24060122140150                */
/*Tanggal   : 02 Mei 2024                   */
/*Nama File : Animal.java                   */

public abstract class Animal {
    public abstract void eat();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}

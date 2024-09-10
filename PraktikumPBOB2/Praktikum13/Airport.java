/*Nama      : Gigih Haidar Falah            */
/*Nim       : 24060122140150                */
/*Tanggal   : 02 Mei 2024                   */
/*Nama File : Airport.java                  */

public class Airport {
    private Airplane airplane;
    private String name;

    public Airport(String name){
        this.name = name;
    }

    public String givePermissionToLand(iFlyer flyer){
        if (flyer instanceof Airplane){
            return "Izin diberikan untuk mendarat";
        }else{
            return "Izin tidak diberikan untuk mendarat";
        }
    }
}

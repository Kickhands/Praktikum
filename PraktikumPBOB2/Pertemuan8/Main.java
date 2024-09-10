/*  Nama: Gigih Haidar Falah
 *  NIM: 24060122140150
 */
public class Main{
    public static void main (String[] args){
        //kamus
        Ulat K;
        Data<Kupu> anu;
   

        //Algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}

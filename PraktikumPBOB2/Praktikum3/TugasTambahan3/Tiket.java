//NAMA      : GIGIH HAIDAR FALAH
//NIM       : 24060122140150
//LAB       : B2
//PRAKTIKUM3

public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket) {
        // Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 6969;

        // Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert jumlahTiket > 0 : "Jumlah pemesanan harus lebih dari 0";

        // Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert jumlahTiket <= tiketTersedia : "Jumlah pemesanan melebihi tiket yang tersedia";

        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }

    public static void isEWallet(int EWallet) {
        // Memeriksa apakah index e-wallet yang dipilih valid
        assert EWallet >= 1 && EWallet <= 4 : "Indeks EWallet tidak valid";

        // Assertion untuk memastikan e-wallet yang dipilih valid
        assert !getEWallet(EWallet).isEmpty() : "EWallet tidak valid";

        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

    private static String getEWallet(int index) {
        switch (index) {
            case 1:
                return "OVO";
            case 2:
                return "GoPay";
            case 3:
                return "DANA";
            case 4:
                return "LinkAja";
            default:
                return "";
        }
    }
}

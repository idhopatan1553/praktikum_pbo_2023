package latihanP4;

public class BiayaEmasKawin {
    private double totalBeratEmas;

    // Konstruktor untuk inisialisasi total berat emas
    public BiayaEmasKawin(double totalBerat) {
        this.totalBeratEmas = totalBerat;
    }

    // Metode untuk menghitung total pembayaran
    public double hitungTotalPembayaran(double hargaPerGram) {
        return totalBeratEmas * hargaPerGram;
    }

    public static void main(String[] args) {
        double totalBerat = 15.7;  // Total berat emas yang akan dibeli
        double hargaPerGram = 570000;  // Harga per gram emas

        BiayaEmasKawin pembelian = new BiayaEmasKawin(totalBerat);
        double totalPembayaran = pembelian.hitungTotalPembayaran(hargaPerGram);
        System.out.println("Total Berat      : " + totalBerat + " gram");
        System.out.println("Harga PerGram    : Rp. " + hargaPerGram);
        System.out.println("Total Pembayaran : Rp. " + totalPembayaran);
    }
}

package L56_umurBarangAntik;
/**
 * @author 
 * Nama		 	: MUHAMMAD RIDHO FATHAN
 * Nim 			: 221106042807
 * Kelas 		: Reguler - D
 * Info Program : Latihan 56 tentang Barang Antik
 */

public class BarangAntik {
    private int umur;

    // Konstruktor
    public BarangAntik(int umur) {
        this.umur = umur;
    }

    // Metode untuk menampilkan umur barang antik
    public void tampilUmur() {
        System.out.println("Umur barang antik: " + umur + " tahun.");
    }
}
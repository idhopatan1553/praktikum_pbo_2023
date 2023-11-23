package L56_umurBarangAntik;
/**
 * @author 
 * Nama		 	: MUHAMMAD RIDHO FATHAN
 * Nim 			: 221106042807
 * Kelas 		: Reguler - D
 * Info Program : Latihan 56 tentang Barang Antik
 */
public class Radio extends BarangAntik {
    private String name;

    // Konstruktor
    public Radio(int umur) {
        super(umur);  // Memanggil konstruktor kelas induk
        this.name = "";  // Inisialisasi name dengan nilai default
    }

    // Metode getter dan setter untuk name
    public String getNama() {
        return name;
    }

    public void setNama(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Radio
        Radio radio = new Radio(50);
        radio.setNama("Radio Tua");
        radio.tampilUmur();
        System.out.println("Nama radio: " + radio.getNama());
    }
}

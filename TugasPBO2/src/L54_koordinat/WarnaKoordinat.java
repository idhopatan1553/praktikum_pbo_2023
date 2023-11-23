package L54_koordinat;
/**
 * @author 
 * Nama		 	: MUHAMMAD RIDHO FATHAN
 * Nim 			: 221106042807
 * Kelas 		: Reguler - D
 * Info Program : Latihan 54 tentang Koordinat
 */
public class WarnaKoordinat extends Koordinat {
	 private String namaWarna;

	    // Konstruktor untuk kelas WarnaKoordinat
	    public WarnaKoordinat(int x, int y, String namaWarna) {
	        super(x, y);  // Memanggil konstruktor kelas induk (Koordinat)
	        this.namaWarna = namaWarna;
	    }

	    // Metode getter dan setter untuk namaWarna
	    public String getNamaWarna() {
	        return namaWarna;
	    }

	    public void setNamaWarna(String namaWarna) {
	        this.namaWarna = namaWarna;
	    }
	}
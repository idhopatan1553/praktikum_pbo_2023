package L55_Handphone;
/**
 * @author 
 * Nama		 	: MUHAMMAD RIDHO FATHAN
 * Nim 			: 221106042807
 * Kelas 		: Reguler - D
 * Info Program : Latihan 55 tentang Handphone
 */
public class BlackBerry extends Handphone {
	private String pinBB;

    // Konstruktor
    public BlackBerry(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
        this.pinBB = ""; // Inisialisasi pinBB dengan nilai default
    }

    // Metode getter dan setter untuk pinBB
    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }

}

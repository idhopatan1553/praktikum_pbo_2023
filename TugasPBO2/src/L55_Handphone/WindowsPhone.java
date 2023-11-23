package L55_Handphone;
/**
 * @author 
 * Nama		 	: MUHAMMAD RIDHO FATHAN
 * Nim 			: 221106042807
 * Kelas 		: Reguler - D
 * Info Program : Latihan 55 tentang Handphone
 */
public class WindowsPhone extends Handphone {
    private String wpKeyStore;

    // Konstruktor
    public WindowsPhone(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
        this.wpKeyStore = ""; // Inisialisasi wpKeyStore dengan nilai default
    }

    // Metode getter dan setter untuk wpKeyStore
    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
}
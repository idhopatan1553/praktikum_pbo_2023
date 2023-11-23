package L55_Handphone;
/**
 * @author 
 * Nama		 	: MUHAMMAD RIDHO FATHAN
 * Nim 			: 221106042807
 * Kelas 		: Reguler - D
 * Info Program : Latihan 55 tentang Handphone
 */
public class Android extends Handphone {
	private String keyStore;

    // Konstruktor
    public Android(String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);
        this.keyStore = ""; // Inisialisasi keyStore dengan nilai default
    }

    // Metode getter dan setter untuk keyStore
    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}

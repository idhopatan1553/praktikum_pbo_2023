package L55_Handphone;
/**
 * @author 
 * Nama		 	: MUHAMMAD RIDHO FATHAN
 * Nim 			: 221106042807
 * Kelas 		: Reguler - D
 * Info Program : Latihan 55 tentang Handphone
 */
public class Handphone {
	 private String manufacture;
	    private String operatingSystem;
	    private String model;
	    private int harga;

	    // Konstruktor
	    public Handphone(String manufacture, String operatingSystem, String model, int harga) {
	        this.manufacture = manufacture;
	        this.operatingSystem = operatingSystem;
	        this.model = model;
	        this.harga = harga;
	    }
	    public String Manufacture() {
			return manufacture;
		}
	    public String operatingSystem() {
			return operatingSystem;
		}
	    public String model() {
			return model;
		}
	    public int harga() {
			return harga;
		}

	    // Metode untuk menampilkan informasi produk
	    public void displayProduct() {
	        System.out.println("Manufaktur: " + manufacture);
	        System.out.println("Sistem Operasi: " + operatingSystem);
	        System.out.println("Model: " + model);
	        System.out.println("Harga: " + harga);
	    }
}

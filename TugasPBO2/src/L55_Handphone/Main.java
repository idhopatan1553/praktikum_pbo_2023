package L55_Handphone;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan kelas Android
        Android androidPhone = new Android("Samsung", "Android", "Grand", 3000000);
        androidPhone.setKeyStore("234ibfd3840fo");

        // Menampilkan informasi produk Android, termasuk Android Key Store
        System.out.println("Manufaktur	 : " + androidPhone.Manufacture());
        System.out.println("OS		 : " + androidPhone.operatingSystem());
        System.out.println("Model	   	 : " + androidPhone.model());
        System.out.println("Harga		 : " + androidPhone.harga());
        System.out.println("Android Key Store: " + androidPhone.getKeyStore());
        System.out.println();

        // Contoh penggunaan kelas BlackBerry
        BlackBerry blackBerryPhone = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackBerryPhone.setPinBB("BHS249");

        // Menampilkan informasi produk BlackBerry, termasuk PIN
        System.out.println("Manufaktur	: " + blackBerryPhone.Manufacture());
        System.out.println("OS		: " + blackBerryPhone.operatingSystem());
        System.out.println("Model		: " + blackBerryPhone.model());
        System.out.println("Harga		: " + blackBerryPhone.harga());
        System.out.println("PIN		: " + blackBerryPhone.getPinBB());
        System.out.println();

        // Contoh penggunaan kelas WindowsPhone
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.setWpKeyStore("UUUQIJWORJ");

        // Menampilkan informasi produk WindowsPhone, termasuk Windows Phone Key Store
        System.out.println("Manufaktur	: " + windowsPhone.Manufacture());
        System.out.println("OS		: " + windowsPhone.operatingSystem());
        System.out.println("Model		: " + windowsPhone.model());
        System.out.println("Harga		: " + windowsPhone.harga());
        System.out.println("WP Key Store 	: " + windowsPhone.getWpKeyStore());
    }
}

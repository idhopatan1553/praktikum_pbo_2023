package L56_umurBarangAntik;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan kelas Radio
        Radio radio = new Radio(234);
        radio.setNama("Radio AM");

        // Menampilkan informasi barang antik (Radio)
        System.out.println("Nama barang antik: " + radio.getNama());
        radio.tampilUmur();
    }
}
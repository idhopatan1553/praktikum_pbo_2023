package L54_koordinat;

public class Main {
	public static void main(String[] args) {
        // Contoh penggunaan kelas WarnaKoordinat
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");

        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu X: " + warnaKoordinat.getX());
        System.out.println("Koordinat Sumbu Y: " + warnaKoordinat.getY());
    }
}
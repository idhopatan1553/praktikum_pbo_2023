package latihanP4;
import java.util.Scanner;

public class Kubus {
	
	    // Atribut
	    private int sisi;
	    private int massa;

	    // Konstruktor
	    public Kubus(int sisi, int massa) {
	        this.sisi = sisi;
	        this.massa = massa;
	    }

	    // Get dan Set buat sisi dan massa
	    public int getSisi() {return sisi;}

	    public void setSisi(int sisi) {this.sisi = sisi;}

	    public int getMassa() {return massa;}

	    public void setMassa(int massa) {
	        this.massa = massa;}

	    // untuk menghitung volume 
	    public int hitungVolume(int parSisi) {
	        return parSisi * parSisi * parSisi;
	    }

	    //untuk menghitung massa jenis
	    public int hitungMassaJenis(int parMassa, int volume) {
	        return parMassa / volume;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Meminta input sisi kubus dari pengguna
	        System.out.print("Silahkan Inputkan Angka\n");
	        System.out.print("panjang sisi kubus: ");
	        int sisi = scanner.nextInt();

	        // Meminta input massa kubus dari pengguna
	        System.out.print("massa kubus	  : ");
	        int massa = scanner.nextInt();

	        // Membuat objek Kubus
	        Kubus kubus = new Kubus(sisi, massa);

	        // Menampilkan atribut sisi dan massa
	        System.out.println("\n===== Massa Jenis Kubus =====");
	        System.out.println("Sisi = " + kubus.getSisi());
	        System.out.println("Massa = " + kubus.getMassa());

	        // Menghitung volume kubus
	        int volume = kubus.hitungVolume(kubus.getSisi());
	        System.out.println("===== Hasil Perhitungan =====");
	        System.out.println("Volume = " + volume);

	        // Menghitung massa jenis kubus
	        int massaJenis = kubus.hitungMassaJenis(kubus.getMassa(), volume);
	        System.out.println("Massa Jenis = " + massaJenis);

	        // Menutup Scanner
	        scanner.close();
	    }
	}

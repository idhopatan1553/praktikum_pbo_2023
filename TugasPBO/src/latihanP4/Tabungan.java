package latihanP4;
import java.util.Scanner;

public class Tabungan {
	    // Atribut
	    private int saldo;

	    // Konstruktor
	    public Tabungan(int saldo) {
	        this.saldo = saldo;
	    }

	    // Metode untuk mengambil uang dari tabungan
	    public int ambilUang(int jumlah) {
	        if (saldo >= jumlah) {
	            saldo -= jumlah;
	            return jumlah;
	        } else {
	            System.out.println("\n===== Saldo tidak mencukupi =====\n");
	            return 0;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Meminta input saldo awal
	        System.out.print("===== Program Penarikan Uang =====\n");
	        System.out.print("Masukkan saldo awal	: ");
	        int saldoAwal = scanner.nextInt();

	        // Membuat objek Tabungan dengan saldo awal
	        Tabungan tabungan = new Tabungan(saldoAwal);

	        // Meminta input jumlah uang yang akan diambil
	        System.out.print("Masukkan jumlah uang yang akan diambil: ");
	        int jumlahUang = scanner.nextInt();

	        // Mengambil uang dari tabungan
	        int jumlahYangDiambil = tabungan.ambilUang(jumlahUang);
	        System.out.print("\n============================================");
	        System.out.println("\nJumlah yang diambil	: " + jumlahYangDiambil);
	        System.out.println("Saldo sekarang		: " + tabungan.saldo);

	        // Menutup Scanner
	        scanner.close();
	    }
	}
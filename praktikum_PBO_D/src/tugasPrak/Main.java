package tugasPrak;
import java.util.Scanner;
public class Main extends Operasi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1, perulangan;
		// Data diri
				System.out.print("Nama : Muhammad Ridho Fathan\n");
				System.out.print("Kelas : REG-D/03\n");
				System.out.print("Prodi : TI\n");
				System.out.println("======================== \n");
//		perulangnFOR	
		System.out.print("Masukan Perulangan : " );
		perulangan = input.nextInt();
			for(int i=1; i<=perulangan; i++) {
				System.out.print("\n============================\n" );
				System.out.println("     Perulangan ke - " + i );
				System.out.print("============================\n" );
//		input user
//		System.out.print("Masukan angka 1 :  ");
//		angka1 = input.nextInt();
//		System.out.print("Masukan angka 2 :  ");
//		angka2 = input.nextInt();
//		input perhitungan
		System.out.print("-- List Operasi Perhitungan --\n"
				+ "1 Pertambahan	3 Pembagian\n"
				+ "2 Pengurangan	4 Perkalian\n"
				+ "Masukan Angka : ");
		angka1 = input.nextInt();
		//PengkondisisanIF
		if(angka1 == 1) {
			pertambahan();
		} else if (angka1 == 2) {
			pengurangan();
		} else if (angka1 == 3) {
			pembagian();
		} else if (angka1 == 4) {
			perkalian();
		} else {
			System.out.println("Angka yang anda masukan salah");
		}
	}
}
}

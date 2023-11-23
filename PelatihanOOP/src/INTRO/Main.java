package INTRO;
import java.util.Scanner;
public class Main extends Perkalian{

	public static void main (String[] args) {
		//TODO Auto-generated method stub
		// Inisialisasi
		int angka1;
		int loop;
		Scanner input1 = new Scanner(System.in);
		Scanner loop_input = new Scanner(System.in);
		
		// Data diri
		System.out.print("Nama : Fathan\n");
		System.out.print("Kelas : REG-D\n");
		System.out.print("Prodi : TI\n");
		System.out.println("======================== \n");
		
		System.out.print("Masukan Perulangan : ");
		loop = loop_input.nextInt();
	
		// looping function
		for (int i=1;i<=loop;i++) {
			// Input User
			System.out.print("\nMasukan Perhitungan yang ingin dilakukan : \n"
					+ "1, Pertambahan\n"
					+ "2, Pengurangan\n"
					+ "3, Pembagian\n"
					+ "4, Perkalian\n"
					+ "Masukan Angka : ");
			angka1 = input1.nextInt();
			
			//Pengkondisisan
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
 
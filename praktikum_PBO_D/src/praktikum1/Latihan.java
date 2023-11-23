package praktikum1;
import java.util.Scanner;

public class Latihan {
	public static void main(String args[]) {
//		System.out.println("hello world");
//		inisialisasi Variable
		int angka1, angka2, hasil;
//		input user
		Scanner input = new Scanner(System.in);
		System.out.print("--- Pertambahan ---\n");
		System.out.print("Masukan Angka 1 : ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2 : ");
		angka2 = input.nextInt();
//		hasil
		hasil = angka1 * angka2;
		System.out.println("Hasil Perhitungan = "+hasil);
		
//		inisialisasi variable
		String namaDepan, namaBelakang, fullName;
//		input user
		System.out.print("Masukan Nama Depanmu gess : ");
		namaDepan= input.next();
		System.out.print("Masukan Nama Belakangmu gess : ");
		namaBelakang= input.next();
		
		fullName = namaDepan + " " + namaBelakang;
		System.out.println(fullName);
	}
}

package tugasPrak;
import java.util.Scanner;
public class Operasi {
	
	public static int angka1, angka2, hasil;
	static Scanner Input = new Scanner(System.in);
	public static void pertambahan () {
		//TODO Auto-generated method stub
		System.out.print("--- Pertambahan ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = Input.nextInt();
		
		hasil = angka1 + angka2;
		System.out.print("Hasil pertambahannya adalah "+hasil);
	}
	public static void pengurangan () {
		//TODO Auto-generated method stub
		System.out.print("--- Pengurangan ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = Input.nextInt();
		
		hasil = angka1 - angka2;
		System.out.print("Hasil pengurangannya adalah "+hasil);
	}
	public static void pembagian () {
		//TODO Auto-generated method stub
		System.out.print("--- Pembagian ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = Input.nextInt();
		
		hasil = angka1 / angka2;
		System.out.print("Hasil pembagiannya adalah "+hasil);
	}
	public static void perkalian () {
		//TODO Auto-generated method stub
		System.out.print("--- Perkalian ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = Input.nextInt();
		
		hasil = angka1 * angka2;
		System.out.print("Hasil perkaliannya adalah "+hasil);
	}
}

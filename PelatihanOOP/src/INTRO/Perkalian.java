package INTRO;
import java.util.Scanner;
public class Perkalian {
	
	public static void perkalian () {
		//TODO Auto-generated method stub
		int angka1, angka2, hasil;
		Scanner Input = new Scanner(System.in);
		
		System.out.print("--- Perkalian ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = Input.nextInt();
		
		hasil = angka1 * angka2;
		System.out.print("Hasil Perhitungan = "+hasil);
	}
	public static void pembagian () {
		//TODO Auto-generated method stub
		int angka1, angka2, hasil;
		Scanner Input = new Scanner(System.in);
		
		System.out.print("--- Pembagian ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = Input.nextInt();
		
		hasil = angka1 / angka2;
		System.out.print("Hasil Perhitungan = "+hasil);
	}
	public static void pertambahan () {
		//TODO Auto-generated method stub
		int angka1, angka2, hasil;
		Scanner Input = new Scanner(System.in);
		
		System.out.print("--- Pertambahan ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = Input.nextInt();
		
		hasil = angka1 + angka2;
		System.out.print("Hasil Perhitungan = "+hasil);
	}
	public static void pengurangan () {
		//TODO Auto-generated method stub
		int angka1, angka2, hasil;
		Scanner Input = new Scanner(System.in);
		
		System.out.print("--- Pengurangan ---\n");
		System.out.print("Masukan Angka 1 = ");
		angka1 = Input.nextInt();
		System.out.print("Masukan Angka 2 = ");
		angka2 = Input.nextInt();
		
		hasil = angka1 - angka2;
		System.out.print("Hasil Perhitungan = "+hasil);
	}
	
	
}

package praktikum2;
import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int angka; 
		
		System.out.print("Masukan Angka = ");
		angka = input.nextInt();
		
		// Pengkondisian
		if (angka > 5) {
			System.out.print("Angka yang anda masukan lebih dari 5");
		} else {
			System.out.print("Angka yang anda masukan kurang dari 5");
		}
		
	}
}
